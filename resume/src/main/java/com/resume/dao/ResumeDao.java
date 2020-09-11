package com.resume.dao;

import java.util.List;

import com.resume.dto.Academic;
import com.resume.dto.BoardPager;
import com.resume.dto.Career;
import com.resume.dto.Ceritificate;
import com.resume.dto.Education;
import com.resume.dto.JoinDto;
import com.resume.dto.Resume;
import com.resume.dto.UserInfo;

public interface ResumeDao {
	
	// 이력 업로드
	public void resumeInsert(Resume resume);
	
	// 이력 리스트 (사용자)
	public List<Resume> selectResumeList(BoardPager boardPager);
	
//	public Resume getResumeContent(int r_id) throws Exception;
	
	// 이력 전체 조회 (페이징)
	public List<JoinDto> selectAllResumeList(BoardPager boardPager);
	
	// 이력 상세 보기
	public Resume resumeSelectOne(Resume resume);
	
	// 이력 수정
	public void resumeUpdate(Resume resume);
	
	// 이력 삭제
	public Resume resumeDelete(Resume resume);
	
	//resumeInfomation
	public Resume resumeInfomation(Resume resume);
	
	//
	public UserInfo userInfoSelectOne(UserInfo resume);
	
	// 학력 등록
	public void academicInsert(Academic resume);
	
	// 자격증 등록
	public void certificateInsert(Ceritificate resume);
	
	// 경력 등록
	public void careerInsert(Career resume);
	
	// 교육 등록
	public void educationInsert(Education resume);


}
