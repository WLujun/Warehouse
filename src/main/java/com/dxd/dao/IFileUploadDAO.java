package com.dxd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dxd.base.dao.IBaseDAO;
import com.dxd.pojo.FileSource;
import com.dxd.pojo.RenovationIMG;
@Repository
public interface IFileUploadDAO extends IBaseDAO<FileSource>{

	public List<FileSource> selectImagesURL(FileSource f) throws Exception;

	public int deleteImagesURL(FileSource f) throws Exception;

	public List<RenovationIMG> selectRenovationIMG(@Param("id")String id)throws Exception;

	public int updateFilesource(FileSource f)throws Exception;

	public String selectVideoUserId(@Param("userId")String userId)throws Exception;

}
