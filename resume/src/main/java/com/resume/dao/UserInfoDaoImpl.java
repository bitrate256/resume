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
	
	//사용자 등록
	@Override
	public void userInsert(UserInfo user) {
//		System.out.println("user정보 = "+user);
		 session.insert(queryprefix+"userInsert", user);
	}
	
	//사용자 정보 수정
	@Override
	public void userInfoUpdate(UserInfo user) {
		System.out.println("user정보 수정 = "+user);
		session.selectOne(queryprefix+"userInfoUpdate", user);
	}
	
	
	
	
	
}//class end
