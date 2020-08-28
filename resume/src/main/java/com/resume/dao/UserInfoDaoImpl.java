package com.resume.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserInfoDaoImpl {
	
	@Autowired
	SqlSessionTemplate session;

	private String queryprefix = "user.";
	
	
	
	
	
	
}//class end
