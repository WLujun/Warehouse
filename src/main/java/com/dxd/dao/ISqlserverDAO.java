package com.dxd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.dxd.pojo.Product;
import com.dxd.pojo.Search;


@Repository
public interface ISqlserverDAO{

	public List<Product> selectProduct(@Param("v")Search v,@Param("page")Integer page,@Param("limit")Integer limit) throws Exception;

	public int selectAllProduct(@Param("v")Search v) throws Exception;

}
