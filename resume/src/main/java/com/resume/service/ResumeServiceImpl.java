package com.resume.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

import com.resume.dao.ResumeDao;
import com.resume.dto.Resume;
import com.resume.dto.UserInfo;

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

	@Inject
	private ResumeDao resumeDao;
	
	private List<Resume> getResumeList() throws Exception {
		return ResumeDao.getResumeList();
	}

	// 이력 전체 조회
	@Override
	public List<Resume> resumeInfoList(String page, String rows) {
		// TODO Auto-generated method stub
		return null;
	}




}
