package com.resume.dao;

import java.util.List;

import com.resume.dto.JqGrid;
import com.resume.dto.UserInfo;

public interface UserInfoDao {
	
	//로그인 확인
	public UserInfo userSelectOne(UserInfo user);
	
	//사용자 등록
	public void userInsert(UserInfo user);
	
	//사용자 정보 수정
	public void userInfoUpdate(UserInfo user);
	
	//사용자 전체 조회
	public List<UserInfo> userInfoList(String page, String rows);
	
	//사용자 전체 카운트
	public JqGrid gridCount();
	
	//사번 중복체크
	public int userIdCheck(int u_id);
	
	//이메일 중복 체크
	public int emailCheck(String u_eamil);
	
}//inter end
