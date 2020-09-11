package com.resume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.resume.dao.ResumeDao;
import com.resume.dto.Academic;
import com.resume.dto.BoardPager;
import com.resume.dto.Career;
import com.resume.dto.Ceritificate;
import com.resume.dto.Education;
import com.resume.dto.JoinDto;
import com.resume.dto.Resume;
import com.resume.dto.SearchDto;
import com.resume.dto.SkillInventory;
import com.resume.dto.SpecialTech;
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



	// 이력 전체 조회(페이징)
	@Override
	public List<JoinDto> selectAllResumeList(BoardPager boardPager) {
	
		return dao.selectAllResumeList(boardPager);
	}

	@Override
	public Resume resumeSelectOne(Resume resume) {
		// TODO Auto-generated method stub
		return dao.resumeSelectOne(resume);
	}

	@Override
	public int selectResumeCount(SearchDto searchDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void academicInsert(Academic resume) {
		
		dao.academicInsert(resume);
	}

	@Override
	public void certificateInsert(Ceritificate resume) {
		dao.certificateInsert(resume);
		
	}

	@Override
	public void careerInsert(Career resume) {
		dao.careerInsert(resume);
	}

	@Override
	public void educationInsert(Education resume) {
		dao.educationInsert(resume);
	}

	@Override
	public void specialTechInsert(SpecialTech resume) {
		dao.specialTechInsert(resume);
	}

	@Override
	public void skillInventoryInsert(SkillInventory resume) {
		dao.skillInventoryInsert(resume);
	}

	@Override
	public void fileInsert(Resume resume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Resume userInfoSelectOne(Resume resume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resume academicSelectOne(Resume resume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resume certificateSelectOne(Resume resume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resume careerSelectOne(Resume resume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resume educationSelectOne(Resume resume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resume specialTechSelectOne(Resume resume) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resume skillInventorySelectOne(Resume resume) {
		// TODO Auto-generated method stub
		return null;
	}
	//resumeInfomation
	@Override
	public Resume resumeInfomation(Resume resume) {
		
		return dao.resumeInfomation(resume);
	}

	@Override
	public UserInfo userInfoSelectOne(UserInfo resume) {
		 
		return dao.userInfoSelectOne(resume);
	}

	@Override
	public void resumeUpdateForm(Resume resume) {
	
		return dao.resumeUpdateForm(resume);
	}


	
	
	
}
