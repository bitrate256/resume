package com.resume.dao;

import com.resume.dto.Department;

public interface DepartmentDao {

	//부서이름 중복체크
	public int departmentOverlap(Department department);
	
	//부서 등록
	public void departmentInsert(Department department);
	
	
}//inter end
