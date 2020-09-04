package com.resume.service;

import java.util.List;

import com.resume.dto.BoardPager;
import com.resume.dto.JoinDto;
import com.resume.dto.Resume;
import com.resume.dto.SearchDto;
import com.resume.dto.UserInfo;

public interface ResumeService {
	
	// 이력 업로드
	public void resumeInsert(Resume resume);
	
	// 이력 수정
	public void resumeUpdate(Resume resume);
	
	// 이력 전체 조회
	public List<Resume> resumeInfoList(String page, String rows);
	
	// 이력  전체 조회(페이징)
	public List<JoinDto> selectAllResumeList(BoardPager boardPager);
	
	// 이력 총 레코드 가져오기
	public int selectResumeCount(SearchDto searchDto);
	
	//상세조회
	public Resume resumeSelectOne(int r_id);
}
