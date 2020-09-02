package com.resume.service;

import java.util.List;

import com.resume.dto.Resume;
import com.resume.dto.UserInfo;

public interface ResumeService {
	
	// 이력 업로드
	public void resumeInsert(Resume resume);
	
	// 이력 수정
	public void resumeUpdate(Resume resume);
	
	// 이력 전체 조회
	public List<Resume> resumeInfoList(String page, String rows);

	// 이력 리스트 2
	public List<Resume> getResumeList() throws Exception;



}
