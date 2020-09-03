package com.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.dao.DepartmentDao;
import com.resume.dto.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	
	@Autowired
	private DepartmentDao dao;
	
	
	//부서이름 중복체크
	@Override
	public int departmentOverlap(Department department) {
	
		return dao.departmentOverlap(department);
	}

	//부서 등록
	@Override
	public void departmentInsert(Department department) {
		
		 dao.departmentInsert(department);
	}
	
	
	
	
	
	
	
	
}//class end
