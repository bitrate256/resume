package com.resume.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resume.dto.BoardPager;
import com.resume.dto.Department;
import com.resume.dto.SearchDto;

@Repository
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	SqlSessionTemplate session;

	private String queryprefix = "department.";

	@Override
	public int departmentOverlap(Department department) {

		return session.selectOne(queryprefix + "departmentOverlap", department);
	}

	// 부서 등록
	@Override
	public void departmentInsert(Department department) {

		session.insert(queryprefix + "departmentInsert", department);
	}

	// 부서 리스트
	@Override
	public List<Department> departmentList(Department dto) {

		List<Department> departmentList = new ArrayList<Department>();
		departmentList = session.selectList(queryprefix + "departmentList", dto);

		return departmentList;
	}

	// 부서 총 레코드
	@Override
	public int departmentCount(Department dto) {
		
		return session.selectOne(queryprefix+"departmentCount", dto);
	}

}// class end
