package com.dxd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dxd.pojo.FileSource;
@Repository
public interface IWaterMarkDAO {

	public List<FileSource> selectMainImage(@Param("id")String id)throws Exception;

	public String selectSoption(@Param("id")String id)throws Exception;

}
