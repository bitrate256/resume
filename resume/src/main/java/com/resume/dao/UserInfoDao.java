package com.resume.dao;

import com.resume.dto.UserInfo;

public interface UserInfoDao {
	
	//로그인 확인
	public UserInfo userSelectOne(UserInfo user);
	
	//사용자 등록
	public void userInsert(UserInfo user);
	
}//inter end
