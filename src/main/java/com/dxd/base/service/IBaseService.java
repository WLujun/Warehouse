package com.dxd.base.service;

import java.util.List;

public interface IBaseService <T>{

	public boolean save(T t);

	public boolean remove(T t);

    public boolean modify(T t);

    public T findById(Integer id);

    public List<T> findAll();

}
