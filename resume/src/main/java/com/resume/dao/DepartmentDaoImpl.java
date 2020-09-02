package com.resume.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resume.dto.Department;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {
	
	
	@Autowired
	SqlSessionTemplate session;

	private String queryprefix = "department.";

	@Override
	public int departmentOverlap(Department department) {
		
		return session.selectOne(queryprefix+"departmentOverlap", department);
	}
	
	
	//부서 등록
	@Override
	public void departmentInsert(Department department) {
		
		 session.insert(queryprefix+"departmentInsert", department);
	}
	
	
	
	
	
}//class end
