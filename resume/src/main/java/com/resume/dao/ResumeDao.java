package com.resume.dao;

import java.util.List;

import com.resume.dto.BoardPager;
import com.resume.dto.Resume;

public class ResumeDao {
	
	// 이력 업로드
	public void resumeInsert(Resume r_id);
	
	// 이력 리스트 (사용자)
	public List<Resume> selectResumeList(BoardPager boardPager);
	
	// 이력 상세 보기
	public Resume resumeSelectOne(int r_id);
	
	// 이력 수정
	public Resume resumeUpdate(Resume uDto);
	
	// 이력 삭제

}
