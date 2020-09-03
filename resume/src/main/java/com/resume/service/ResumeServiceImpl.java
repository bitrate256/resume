package com.resume.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.dao.ResumeDao;
import com.resume.dto.BoardPager;
import com.resume.dto.JoinDto;
import com.resume.dto.Resume;
import com.resume.dto.SearchDto;
import com.resume.dto.UserInfo;

@Service
public class ResumeServiceImpl implements ResumeService {

	@Autowired 
	private ResumeDao dao;

	// 이력 업로드
	public void resumeInsert(Resume resume) {
				
		dao.resumeInsert(resume);
	}
	
	@Override
	public void resumeUpdate(Resume resume) {
		// TODO Auto-generated method stub
		
	}

	// 이력 전체 조회
	@Override
	public List<Resume> resumeInfoList(String page, String rows) {
		// TODO Auto-generated method stub
		return null;
	}

	// 이력 전체 조회(페이징)
	@Override
	public List<JoinDto> selectAllResumeList(BoardPager boardPager) {
	
		return dao.selectAllResumeList(boardPager);
	}

	@Override
	public Resume resumeSelectOne(int r_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectResumeCount(SearchDto searchDto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
