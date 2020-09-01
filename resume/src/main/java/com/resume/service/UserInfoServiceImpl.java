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

	
}//class end
