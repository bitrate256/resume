package com.resume.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.resume.dto.Academic;
import com.resume.dto.BoardPager;
import com.resume.dto.Career;
import com.resume.dto.Ceritificate;
import com.resume.dto.Education;
import com.resume.dto.JoinDto;
import com.resume.dto.Resume;
import com.resume.dto.SkillInventory;
import com.resume.dto.SpecialTech;
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
		resumeAllList = session.selectList(queryprefix+"selectAllResumeList", boardPager);
		System.out.println("이력 전체 리스트 = "+resumeAllList);
		return resumeAllList;
	}
	
	// 이력 상세 보기
	public Resume resumeSelectOne(Resume resume) {
		System.out.println("DAO ="+resume);
		return session.selectOne(queryprefix+"resumeSelectOne", resume);
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
	
	//
	@Override
	public UserInfo userInfoSelectOne(UserInfo resume) {
		
		return session.selectOne(queryprefix+"userInfoSelectOne", resume);
	}

	@Override
	public void academicInsert(Academic resume) {
		
		session.insert(queryprefix+"academicInsert", resume);
	}

	@Override
	public void certificateInsert(Ceritificate resume) {


		session.insert(queryprefix+"certificateInsert", resume);		
	}
	
	@Override
	public void careerInsert(Career resume) {
	
		session.insert(queryprefix+"careerInsert", resume);
	}

	@Override
	public void educationInsert(Education resume) {
		session.insert(queryprefix+"educationInsert", resume);
	}

	@Override
	public void specialTechInsert(SpecialTech resume) {
		session.insert(queryprefix+"specialTechInsert", resume);
	}

	@Override
	public void skillInventoryInsert(SkillInventory resume) {
		session.insert(queryprefix+"skillInventoryInsert", resume);
	}
	
	
	
}
