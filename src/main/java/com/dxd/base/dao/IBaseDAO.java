package com.dxd.base.dao;

import java.util.List;
/**
 * 公共DAO层接口
 * @author lujun created at 2018年11月05日 15点52分58秒
 *
 * @param <T>
 */
public interface IBaseDAO <T>{

	public int insert(T t);

	public int delete(T t);

    public int update(T t);

    public T selectById(Integer id);

    public List<T> selectAll();

}
