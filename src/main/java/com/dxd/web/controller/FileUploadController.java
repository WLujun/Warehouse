package com.dxd.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.dxd.pojo.FileSource;
import com.dxd.pojo.RenovationIMG;
import com.dxd.pojo.ResultMap;
import com.dxd.pojo.UploadStatus;
import com.dxd.service.IFileUploadService;
import com.dxd.utils.NameUtil;
import com.dxd.utils.ParameterUtil;

@Controller
@RequestMapping("fileUpload")
public class FileUploadController {

	private static Logger logger = Logger.getLogger(FileUploadController.class);

	@Resource
	private IFileUploadService fileService;

	/**
	 * 采用spring提供的上传文件的方法
	 * @param request
	 * @return String
	 * @throws IllegalStateException
	 * @throws IOException
	 */
	@RequestMapping("springUpload")
	@ResponseBody
	public String springUpload(HttpServletRequest request,FileSource fSourece) throws Exception{
		logger.debug("Start Upload File...");
		//将当前上下文初始化给  CommonsMutipartResolver（多部分解析器）
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(
				request.getSession().getServletContext());
		System.out.println(fSourece);
		//检查form中是否有enctype="multipart/form-data"
		if(multipartResolver.isMultipart(request)) {
			MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;//将request变成多部分request
			Iterator iter = multiRequest.getFileNames();//获取multiRequest中所有的文件名
			while(iter.hasNext()) {//一次遍历所有文件
				MultipartFile file=multiRequest.getFile(iter.next().toString());
				if(file != null) {
					String path = ParameterUtil.getParameterValue("fileSourcePath")
							+File.separator+ParameterUtil.getParameterValue("fileSourceDir");
					File fdir = new File(path);
					if (!fdir.exists() && !fdir.isDirectory()){
						fdir.mkdir();
					}
					String name = NameUtil.getUUID()+"_"+fSourece.getSku()
							+NameUtil.getFileExtName(file.getOriginalFilename());
					file.transferTo(new File(path+File.separator+name));//上传单个上传文件
					fSourece.setFiletype(file.getContentType());
					fSourece.setFileurl(name);
					fSourece.setSign(Integer.parseInt(file.getName()));
					boolean bl = fileService.save(fSourece);//保存单个上传文件
					if(bl) {
						logger.debug("Save One File Success");
					}else {
						logger.debug("Save One File Fail");
					}
				}
			}
			logger.debug("All Uploaded Successfully");
			return "success";
		}
		logger.debug("Upload Exception");
		return "exception";
	}

	/**
     * 这里是获取上传文件状态信息的访问接口
     * @param session
     * @return UploadStatus状态对象
     */
    @ResponseBody
    @RequestMapping("getStatus")
    public UploadStatus getStatus(HttpSession session)throws Exception{
        return (UploadStatus)session.getAttribute("upload_status");
    }

    /**
     * 页面跳转
     * @param fileSource
     * @return ModelAndView
     */
    @RequestMapping("gotoPage")
    public ModelAndView gotoFileUploadJsp(FileSource fileSource)throws Exception{
    	ModelAndView mv = new ModelAndView();
    	mv.getModel().put("model", fileSource);
    	mv.setViewName("upload");
      	return mv;
    }

    /**
     * 获取sku相关图片地址
     * @param FileSource
     * @return List<FileSource>
     * @throws Exception
     */
    @RequestMapping("getImagesURL")
    @ResponseBody
    public List<FileSource> getImagesURL(FileSource fs) throws Exception{
    	if(fs.getPid()!=null && !fs.getPid().equals("")) {
    		String pid = fs.getPid().trim();
        	if(pid != null && !pid.equals("")) {
        		return fileService.findImagesURL(fs);
        	}
    	}
    	return null;
    }

    /**
     * 删除sku相关图片地址
     * @param FileSource
     * @return List<>
     * @throws Exception
     */
    @RequestMapping("deleteImagesURL")
    @ResponseBody
    public ResultMap<?> deleteImagesURL(@RequestParam(value="accessToken",required=true)String accessToken,
    		@RequestParam(value="userId",required=true)String userId,FileSource f) throws Exception{
    	if(fileService.verificationUserId(userId)) {
	    	//真删除
	    	boolean bool = fileService.removeImagesURL(f);
	    	if(bool) {
	        	String path = ParameterUtil.getParameterValue("fileSourcePath")+File.separator+ParameterUtil.getParameterValue("fileSourceDir")+File.separator+f.getFileurl();
	    		System.out.println(path);
	        	File file = new File(path);
	        	boolean fl = file.delete();
	        	if(fl) return new ResultMap<>("delete success",200);
	    	}
    	}
    	//假删除
    	//if(fileService.modifyFilesource(f)) return "Delete Successful";
    	return new ResultMap<>("delete fail",200);
    }

    @RequestMapping("getRenovationIMG")
    @ResponseBody
    public List<RenovationIMG> getRenovationIMG(@RequestParam(value="id",required=true)String id) throws Exception{
    	return fileService.findRenovationIMG(id);
    }


}
