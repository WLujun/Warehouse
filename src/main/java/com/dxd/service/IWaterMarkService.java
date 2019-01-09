package com.dxd.service;

import java.util.List;

import com.dxd.pojo.FileSource;

public interface IWaterMarkService {

	public List<FileSource> findMainImage(String id)throws Exception;

	public String findSoption(String id)throws Exception;

}
