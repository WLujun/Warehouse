package com.dxd.service;

import java.util.List;

import com.dxd.base.service.IBaseService;
import com.dxd.pojo.FileSource;
import com.dxd.pojo.RenovationIMG;

public interface IFileUploadService extends IBaseService<FileSource>{

	public List<FileSource> findImagesURL(FileSource f)throws Exception;

	public boolean removeImagesURL(FileSource f) throws Exception;

	public List<RenovationIMG> findRenovationIMG(String id)throws Exception;

	public boolean modifyFilesource(FileSource f)throws Exception;

	public boolean verificationUserId(String userId)throws Exception;

}
