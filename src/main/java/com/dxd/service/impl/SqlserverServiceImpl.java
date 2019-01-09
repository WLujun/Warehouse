package com.dxd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxd.dao.ISqlserverDAO;
import com.dxd.pojo.Product;
import com.dxd.pojo.Search;
import com.dxd.service.ISqlserverService;
import com.dxd.utils.db.DataSource;
@DataSource("dataSource2")
@Service
public class SqlserverServiceImpl implements ISqlserverService{

	@Autowired
	private ISqlserverDAO sqlserverDao;

	@Override
	public List<Product> findProduct(Search vo,Integer page, Integer limit) throws Exception {
		// TODO Auto-generated method stub
		return sqlserverDao.selectProduct(vo,page,limit);
	}

	@Override
	public int findAllProduct(Search v) throws Exception {
		// TODO Auto-generated method stub
		return sqlserverDao.selectAllProduct(v);
	}



}
