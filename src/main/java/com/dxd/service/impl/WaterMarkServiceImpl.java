package com.dxd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxd.dao.IWaterMarkDAO;
import com.dxd.pojo.FileSource;
import com.dxd.service.IWaterMarkService;
import com.dxd.utils.db.DataSource;
@DataSource("dataSource1")
@Service
public class WaterMarkServiceImpl implements IWaterMarkService{

	@Autowired
	private IWaterMarkDAO wmDao;

	@Override
	public List<FileSource> findMainImage(String id) throws Exception {
		// TODO Auto-generated method stub
		return wmDao.selectMainImage(id);
	}

	@Override
	public String findSoption(String id) throws Exception {
		// TODO Auto-generated method stub
		return wmDao.selectSoption(id);
	}

}
