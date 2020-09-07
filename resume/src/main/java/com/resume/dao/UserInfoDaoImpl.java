package com.resume.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resume.dto.BoardPager;
import com.resume.dto.JqGrid;
import com.resume.dto.SearchDto;
import com.resume.dto.UserInfo;

@Repository
public class UserInfoDaoImpl implements UserInfoDao {
	
	@Autowired
	SqlSessionTemplate session;

	private String queryprefix = "user.";
	
	//로그인 체크
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
	
	
	//사용자 전체 조회(그리드)
	@Override
	public List<UserInfo> userInfoList(String page, String rows) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("page", page);
		map.put("rows", rows);
		return session.selectList(queryprefix+"userInfoList", map);
	}
	
	//사용자 전체 카운트(그리드)
	@Override
	public JqGrid gridCount() {
		
		return session.selectOne(queryprefix+"gridCount");
	}
	
	
	//사번 중복 체크
	@Override
	public int userIdCheck(int u_id) {
		
		return session.selectOne(queryprefix+"userIdCheck", u_id);
	}
	
	
	//이메일 중복 체크
	@Override
	public int emailCheck(String u_eamil) {
		
		System.out.println("u_eamil = "+u_eamil);
		
		return session.selectOne(queryprefix+"emailCheck", u_eamil);
	}
	
	
	//사용자 전체 목록(ajax)
	@Override
	public List<UserInfo> selectUserList(BoardPager boardPager) {
		
		List<UserInfo> selectUserList = new ArrayList<UserInfo>();
		selectUserList = session.selectList(queryprefix+"selectUserList", boardPager);
		
		return selectUserList;
	}
	
	//사용자 전체 레코드(ajax)
	@Override
	public int selectUserCount(SearchDto searchDto) {
		
		return session.selectOne(queryprefix+"selectUserCount", searchDto);
	}
	
	

	
	
	
	
}//class end
