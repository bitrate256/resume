package com.resume.dao;

import java.util.List;

import com.resume.dto.BoardPager;
import com.resume.dto.JqGrid;
import com.resume.dto.SearchDto;
import com.resume.dto.UserInfo;

public interface UserInfoDao {

	// 로그인 확인
	public UserInfo userSelectOne(UserInfo user);

	// 사용자 등록
	public void userInsert(UserInfo user);

	// 사용자 정보 수정
	public void userInfoUpdate(UserInfo user);

	// 사용자 전체 조회(그리드)
	public List<UserInfo> userInfoList(String page, String rows);

	// 사용자 전체 카운트(그리드)
	public JqGrid gridCount();

	// 사번 중복체크
	public int userIdCheck(int u_id);

	// 이메일 중복 체크
	public int emailCheck(String u_eamil);

	// 사용자 전체 목록(ajax)
	public List<UserInfo> selectUserList(BoardPager boardPager);

	// 사용자 전체 레코드(ajax)
	public int selectUserCount(SearchDto searchDto);

	// 사용자 상세보기
	public UserInfo adminUserSelectOneUP(UserInfo user);

	// 사용자 수정
	public void adminUserUpdate(UserInfo user);

	// 사용자 삭제
	public void adminUserDelete(int u_id);

	// 퇴사자 전체 목록(ajax)
	public List<UserInfo> selectRunUserList(BoardPager boardPager);

	// 퇴사자 전체 레코드(ajax)
	public int selectRunUserCount(SearchDto searchDto);
	

}// inter end
