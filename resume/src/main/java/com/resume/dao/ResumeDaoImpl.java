package com.resume.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resume.dto.BoardPager;
import com.resume.dto.JoinDto;
import com.resume.dto.Resume;
import com.resume.dto.SearchDto;
import com.resume.dto.UserInfo;

@Repository
public class ResumeDaoImpl implements ResumeDao {

	@Autowired
	SqlSessionTemplate session;
	
	private String queryprefix = "resume.";
	
	// 이력 업로드
	@Override
	public void resumeInsert(Resume resume) {
		System.out.println("이력 등록 값 = "+resume.toString());
		session.insert(queryprefix+"resumeInsert", resume);
	}

	// 이력 리스트 (사용자)
	@Override
	public List<Resume> selectResumeList(BoardPager boardPager) {
	
		return session.selectList(queryprefix+"selectResumeList", boardPager);
	}
	
	// 이력 전체 리스트(페이징)
	@Override
	public List<JoinDto> selectAllResumeList(BoardPager boardPager) {
		
		List<JoinDto> resumeAllList = new ArrayList<JoinDto>();
		resumeAllList = session.selectList(queryprefix+"selectUserAllList", boardPager);
		System.out.println("이력 전체 리스트 = "+resumeAllList);
		return resumeAllList;
	}
	
	// 이력 상세 보기
	public Resume resumeSelectOne(int r_id) {
		
		return session.selectOne(queryprefix+"resumeSelectOne", r_id);
	}
	
	// 이력 수정
	@Override
	public void resumeUpdate(Resume resume) {
		System.out.println("resume정보 수정 = "+resume);
		session.selectOne(queryprefix+"resumeUpdate", resume);
	}

	// 이력 삭제
	@Override
	public Resume resumeDelete(Resume resume) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	//resumeInfomation
	@Override
	public Resume resumeInfomation(Resume resume) {
		
		return session.selectOne(queryprefix+"resumeInfomation", resume);
	}
	
	
	
}
