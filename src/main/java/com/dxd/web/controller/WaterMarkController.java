package com.dxd.web.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxd.pojo.FileSource;
import com.dxd.service.IWaterMarkService;
import com.dxd.utils.ParameterUtil;

@Controller
@RequestMapping("/WaterMark")
public class WaterMarkController {

	@Resource
	private IWaterMarkService waterMarkService;

	@RequestMapping("wmzip")
	public void getImagesZip(@RequestParam(value="id",required=true)String id,Integer sign,
			HttpServletResponse response)throws Exception{
		//源图片集合
		List<FileSource> list = waterMarkService.findMainImage(id);
		if(list.size() > 0) {
			//卖点文字查询
			String context = waterMarkService.findSoption(id);
			if(context!=null && !context.equals("")) {
				String[] arrCon = context.split(",");
				if(arrCon.length > 1) {
					String downloadFilename = "首图水印卖点框.zip";
					downloadFilename = URLEncoder.encode(downloadFilename, "UTF-8");
					response.setContentType("application/octet-stream");
					response.setHeader("Content-Disposition", "attachment;filename="+downloadFilename);
					ZipOutputStream zos = new ZipOutputStream(response.getOutputStream());
					for (int i = 0;i < list.size();i++) {
						zos.putNextEntry(new ZipEntry(i+"_"+list.get(i).getSku()+"_"+list.get(i).getSign()+".jpg"));
						InputStream is = null;
						try {
							//源图片路径
							String srcImgPath = ParameterUtil.getParameterValue("fileSourcePath")
									+File.separator+ParameterUtil.getParameterValue("fileSourceDir")
									+File.separator+list.get(i).getFileurl();
							//水印图片路径
							String watermarkPath = "waterMarkB.png";
							if(sign == 1) watermarkPath = "waterMarkC.png";
							//开始合成图片
							BufferedImage buffImg = playImages(srcImgPath,watermarkPath,arrCon[0],arrCon[1],list.get(i).getSign());
				            ImageIO.write(buffImg, "JPG", zos);
				        } catch (Exception e) {
				            e.printStackTrace();
				        } finally {
				            try {
				                if (null != is)
				                    is.close();
				            } catch (Exception e) {
				                e.printStackTrace();
				            }
				        }


					}
					try {
						if (null != zos) {
							zos.flush();
							zos.close();
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

	/**
	 * 加水印以及卖点框
	 * @param srcImgPath
	 * @param watermarkPath
	 * @param textOne
	 * @param textTwo
	 * @param sign
	 * @return bufferImg
	 * @throws IOException
	 */
	public BufferedImage playImages(String srcImgPath,String watermarkPath,String textOne,String textTwo,Integer sign) throws IOException{
		Image srcImg = ImageIO.read(new File(srcImgPath));
        BufferedImage buffImg = new BufferedImage(srcImg.getWidth(null),srcImg.getHeight(null), BufferedImage.TYPE_INT_RGB);
        // 2、得到画笔对象
        Graphics2D g = buffImg.createGraphics();
        // 3、设置对线段的锯齿状边缘处理
        g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null), srcImg.getHeight(null), java.awt.Image.SCALE_SMOOTH), 0, 0, null);
        int imgWidth = ((BufferedImage) srcImg).getWidth();
        int imgHeight = ((BufferedImage) srcImg).getHeight();
        // 5、得到水印Image对象。
        Image watermark = ImageIO.read(getFile(watermarkPath));
        // 6、水印图片的位置
        g.drawImage(watermark, (imgWidth-((BufferedImage) watermark).getWidth())/2, (imgHeight-((BufferedImage) watermark).getHeight())/2, null);
        if(sign == 3) {//不是类型3图片就不添加卖点框
	        //卖点1背景
	        GradientPaint paint = new GradientPaint(20, 20, Color.decode("#e13b69"), 100,120, Color.decode("#e44170"), true);
	        g.setPaint(paint);// 设置渐变
	        g.fillRect(0,1080,1200,120);
	        //卖点1文字
	        Font font = new Font("黑体", Font.BOLD, 70);
	        g.setFont(font);
	        g.setColor(Color.white);
	        g.drawString(textOne,0,1166);
	        //卖点2文字长度
	        Font font2 = new Font("黑体", Font.BOLD, 120);
	        // 计算文字长度，计算居中的x点坐标
	        FontMetrics fm = g.getFontMetrics(font2);
	        int textWidth = fm.stringWidth(textTwo);
	        //卖点2背景
	        GradientPaint paint2 = new GradientPaint(20, 20, Color.decode("#ffb901"), 100,120, Color.decode("#ffcf00"), true);
	        g.setPaint(paint2);// 设置渐变
	        Polygon p = new Polygon();
	        p.addPoint(1200-textWidth,1040);
	        p.addPoint(1200,1040);
	        p.addPoint(1200,1200);
	        p.addPoint(1150-textWidth,1200);
	        p.addPoint(1150-textWidth,1080);
	        g.fillPolygon(p);
	        //卖点2文字
	        int widthX = (1150-textWidth)+25;
	        g.setFont(font2);
	        g.setColor(Color.black);
	        g.drawString(textTwo,widthX,1165);
        }
        // 9、释放资源
        g.dispose();
		return buffImg;
	}

	/**
	 * 从项目路径获取水印图片地址
	 * @param srcImgPath
	 * @return FileInputStream
	 * @throws FileNotFoundException
	 */
	private FileInputStream getFile(String srcImgPath) throws FileNotFoundException {
		String filePath = String.valueOf(Thread.currentThread().getContextClassLoader().getResource("")) + "images/"; // 项目路径
		filePath = filePath.replaceAll("file:/", "");
		filePath = filePath.replaceAll("%20", " ");
		filePath = filePath.trim() + srcImgPath.trim();
		if (filePath.indexOf(":") != 1) {
			filePath = File.separator + filePath;
		}
		return new FileInputStream(new File(filePath));
	}

}
