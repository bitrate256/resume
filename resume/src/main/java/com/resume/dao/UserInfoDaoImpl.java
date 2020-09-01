package com.resume.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resume.dto.UserInfo;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {
	
	@Autowired
	SqlSessionTemplate session;

	private String queryprefix = "user.";

	@Override
	public UserInfo userSelectOne(UserInfo user) {
		
		return session.selectOne(queryprefix+"userSelectOne", user);
	}
	
	
	
	
	
}//class end
