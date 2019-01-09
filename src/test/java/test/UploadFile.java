package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class UploadFile {

	/**
	 * 多文件上传 方法四 (name必须都为file与参数名一致 )
	 * @param files
	 * @param session
	 * @return String
	 * @throws IOException
	 */
    public String fileUpload3(@RequestParam(value="file",required= false) MultipartFile[] files,HttpSession session) throws IOException{
         long startTime=System.currentTimeMillis();
         System.out.println(files.length);
         if(files !=null && files.length > 0){
             //循环获取file数组中得文件
             for(int i = 0;i<files.length;i++){
                 MultipartFile file = files[i];
                 //保存
                 file.transferTo(new File("E:\\"+file.getOriginalFilename()));
             }
         }
         long endTime=System.currentTimeMillis();
         System.out.println("方法四的运行时间："+String.valueOf(endTime-startTime)+"ms");
         return "success";
    }


    /**
	 * 通过流的方式上传文件 方法一
	 * @RequestParam("file") 将name=file控件得到的文件封装成CommonsMultipartFile对象
	 * @param file
	 * @return String
	 * @throws IOException
	 */
	@RequestMapping("fileUpload1")
	@ResponseBody
	public String fileUpload(@RequestParam("file") CommonsMultipartFile file) throws IOException {
		//用来检测程序运行时间
		long  startTime=System.currentTimeMillis();
		System.out.println("fileName："+file.getOriginalFilename());
		try {
			//获取输出流
			OutputStream os = new FileOutputStream("E:/"+new Date().getTime()+file.getOriginalFilename());
			//获取输入流 CommonsMultipartFile 中可以直接得到文件的流
			InputStream is=file.getInputStream();
			byte[] bts = new byte[1024];
			//一个一个字节的读取并写入
			while(is.read(bts) != -1) {
				os.write(bts);
			}
			os.flush();
			os.close();
			is.close();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		long  endTime=System.currentTimeMillis();
		System.out.println("方法一的运行时间："+String.valueOf(endTime-startTime)+"ms");
		return "/success";
	}

	/**
	 * 采用file.Transto 来保存上传的文件 方法二
	 * @param file
	 * @return String
	 * @throws IOException
	 */
	@RequestMapping("fileUpload2")
	public String fileUpload2(@RequestParam("file") CommonsMultipartFile file) throws IOException {
		long startTime = System.currentTimeMillis();
		System.out.println("fileName：" + file.getOriginalFilename());
		String path = "E:/" + new Date().getTime() + file.getOriginalFilename();
		File newFile = new File(path); // 通过CommonsMultipartFile的方法直接写文件（注意这个时候）
		file.transferTo(newFile);
		long endTime = System.currentTimeMillis();
		System.out.println("方法二的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		return "success";

	}

}
