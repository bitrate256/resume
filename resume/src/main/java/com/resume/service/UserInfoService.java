package com.resume.service;

import com.resume.dto.UserInfo;

public interface UserInfoService {
	
	//로그인 확인
	public UserInfo userSelectOne(UserInfo user);
	
	//사용자 등록
	public void userInsert(UserInfo user);
	
	//사용자 정보 수정
	public void userInfoUpdate(UserInfo user);

}//inter end
