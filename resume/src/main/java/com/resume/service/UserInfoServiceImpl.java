package com.resume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.dao.UserInfoDao;
import com.resume.dto.BoardPager;
import com.resume.dto.JqGrid;
import com.resume.dto.SearchDto;
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

	
	//사용자 전체 조회(그리드)
	@Override
	public List<UserInfo> userInfoList(String page, String rows) {
		
		return dao.userInfoList(page, rows);
	}

	//사용자 전체 카운트(그리드)
	@Override
	public JqGrid gridCount() {
		
		return dao.gridCount();
	}
	
	
	//사번 중복 체크
	@Override
	public int userIdCheck(int u_id) {
		
		return dao.userIdCheck(u_id);
	}
	
	
	//이메일 중복 체크
	@Override
	public int emailCheck(String u_email) {
		
		return dao.emailCheck(u_email);
	}
	
	//사용자 전체 리스트(ajax)
	@Override
	public List<UserInfo> selectUserList(BoardPager boardPager) {
		
		return dao.selectUserList(boardPager);
	}
	
	//사용자 전체 레코드(ajax)
	@Override
	public int selectUserCount(SearchDto searchDto) {
		
		return dao.selectUserCount(searchDto);
	}
	
	//사용자 상세보기
	@Override
	public UserInfo adminUserSelectOneUP(UserInfo user) {
		
		return dao.adminUserSelectOneUP(user);
	}
	
	//사용자 수정
	@Override
	public void adminUserUpdate(UserInfo user) {
		
		dao.adminUserUpdate(user);
	}
	
	//사용자 삭제
	@Override
	public void adminUserDelete(int u_id) {
		
		dao.adminUserDelete(u_id);
	}
	
	//퇴사자 전체 목록
	@Override
	public List<UserInfo> selectRunUserList(BoardPager boardPager) {
		
		return dao.selectRunUserList(boardPager);
	}
	
	//퇴사자 전체 레코드
	@Override
	public int selectRunUserCount(SearchDto searchDto) {
		
		return dao.selectRunUserCount(searchDto);
	}
	
	//로그인 확인 전체 리스트
	@Override
	public List<UserInfo> loginUserList(UserInfo user) {
		
		return dao.loginUserList(user);
	}
	
	
	

	
}//class end
