package com.resume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.dao.DepartmentDao;
import com.resume.dto.BoardPager;
import com.resume.dto.Department;
import com.resume.dto.SearchDto;

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
	public int departmentInsert(Department department) {
		
		 return dao.departmentInsert(department);
	}
	
	//부서 리스트
	@Override
	public List<Department> departmentList(Department dto) {
		
		return dao.departmentList(dto);
	}

	//부서 총 레코드
	@Override
	public int departmentCount(Department dto) {

		return dao.departmentCount(dto);
	}
	
	
	
	
	
	
	
	
}//class end
