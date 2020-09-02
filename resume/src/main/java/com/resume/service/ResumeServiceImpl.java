package com.resume.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.resume.dao.ResumeDao;
import com.resume.dto.Resume;

public class ResumeServiceImpl implements ResumeService {

	@Autowired 
	private ResumeDao dao;

	// 이력 업로드
	public void resumeInsert(Resume resume) {
				
		dao.resumeInsert(resume);
	}

}
