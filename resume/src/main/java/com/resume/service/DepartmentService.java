package com.resume.service;

import java.util.List;

import com.resume.dto.BoardPager;
import com.resume.dto.Department;
import com.resume.dto.SearchDto;

public interface DepartmentService {
	
	//부서이름 중복체크
	public int departmentOverlap(Department department);
	
	//부서 등록
	public int departmentInsert(Department department);
	
	//부서 리스트
	public List<Department> departmentList(Department dto);
	
	//부서 총 레코드
	public int departmentCount(Department dto);
	
	
}//inter end
