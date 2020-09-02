package com.resume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.dao.UserInfoDao;
import com.resume.dto.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoDao dao;
	
	//로그인 확인
	@Override
	public UserInfo userSelectOne(UserInfo user) {
				
		return dao.userSelectOne(user);
	}
	
	//사용자 등록
	@Override
	public void userInsert(UserInfo user) {
	
		 dao.userInsert(user);
	}
	
	
	//사용자 정보 수정
	@Override
	public void userInfoUpdate(UserInfo user) {
		dao.userInfoUpdate(user);
		
	}
	
	
	

	
}//class end
