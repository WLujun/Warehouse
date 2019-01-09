package com.dxd.service;

import java.util.List;

import com.dxd.pojo.Product;
import com.dxd.pojo.Search;

public interface ISqlserverService {

	public List<Product> findProduct(Search vo,Integer page,Integer limit) throws Exception;

	public int findAllProduct(Search v) throws Exception;


}
