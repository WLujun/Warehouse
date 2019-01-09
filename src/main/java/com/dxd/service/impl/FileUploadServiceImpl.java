package com.dxd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxd.dao.IFileUploadDAO;
import com.dxd.pojo.FileSource;
import com.dxd.pojo.RenovationIMG;
import com.dxd.service.IFileUploadService;
import com.dxd.utils.db.DataSource;
@DataSource("dataSource1")
@Service
public class FileUploadServiceImpl implements IFileUploadService{

	@Autowired
	private IFileUploadDAO filedao;

	@Override
	public boolean save(FileSource t) {
		// TODO Auto-generated method stub
		return filedao.insert(t)>0;
	}

	@Override
	public boolean remove(FileSource t) {
		// TODO Auto-generated method stub
		return filedao.delete(t)>0;
	}

	@Override
	public boolean modify(FileSource t) {
		// TODO Auto-generated method stub
		return filedao.update(t)>0;
	}

	@Override
	public FileSource findById(Integer id) {
		// TODO Auto-generated method stub
		return filedao.selectById(id);
	}

	@Override
	public List<FileSource> findAll() {
		// TODO Auto-generated method stub
		return filedao.selectAll();
	}

	@Override
	public List<FileSource> findImagesURL(FileSource f) throws Exception {
		// TODO Auto-generated method stub
		return filedao.selectImagesURL(f);
	}

	@Override
	public boolean removeImagesURL(FileSource f) throws Exception {
		// TODO Auto-generated method stub
		return filedao.deleteImagesURL(f)>0;
	}

	@Override
	public List<RenovationIMG> findRenovationIMG(String id) throws Exception {
		// TODO Auto-generated method stub
		return filedao.selectRenovationIMG(id);
	}

	@Override
	public boolean modifyFilesource(FileSource f) throws Exception {
		// TODO Auto-generated method stub
		return filedao.updateFilesource(f)>0;
	}

	@Override
	public boolean verificationUserId(String userId) throws Exception {
		boolean bl = false;
		String role = filedao.selectVideoUserId(userId);
		if(role != null && !role.equals("")) {
			if(role.equals("超级管理员") || role.equals("采购人员")) bl = true;
		}
		return bl;
	}

}
