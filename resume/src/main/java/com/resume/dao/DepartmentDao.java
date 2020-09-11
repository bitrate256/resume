package com.resume.dao;

import java.util.List;

import com.resume.dto.BoardPager;
import com.resume.dto.Department;
import com.resume.dto.SearchDto;

public interface DepartmentDao {

	//부서이름 중복체크
	public int departmentOverlap(Department department);
	
	//부서 등록
	public int departmentInsert(Department department);
	
	//부서 리스트
	public List<Department> departmentList(Department dto);
	
	//부서 총 레코드
	public int departmentCount(Department dto);
	
	//부서 상세보기
	public Department adminDepartmentUpDel(Department department);
	
	//부서 수정
	public Department adminDepartmentUpdate(Department department);
	
	//부서 삭제
	public void adminDepartmentDelete(int d_id);
	
}//inter end
