package com.resume.dao;

import java.util.List;

import com.resume.dto.BoardPager;
import com.resume.dto.Resume;

public interface ResumeDao {
	
	// 이력 업로드
	public void resumeInsert(Resume resume);
	
	// 이력 리스트 (사용자)
	public List<Resume> getResumeList() throws Exception;
	
	public Resume getResumeContent(int r_id) throws Exception;
	
	// 이력 상세 보기
	public Resume resumeSelectOne(int r_id);
	
	// 이력 수정
	public void resumeUpdate(Resume resume);
	
	// 이력 삭제
	public Resume resumeDelete(Resume resume);


}
