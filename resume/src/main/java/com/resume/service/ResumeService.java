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
	public void academicInsert(Resume resume);
	public void certificateInsert(Resume resume);
	public void careerInsert(Resume resume);
	public void educationInsert(Resume resume);
	public void specialTechInsert(Resume resume);
	public void skillInventoryInsert(Resume resume);
	public void fileInsert(Resume resume);
	
	
	// 이력 수정
	public void resumeUpdate(Resume resume);
	
	// 이력 전체 조회
	public List<Resume> resumeInfoList(String page, String rows);
	
	// 이력  전체 조회(페이징)
	public List<JoinDto> selectAllResumeList(BoardPager boardPager);
	
	// 이력 총 레코드 가져오기
	public int selectResumeCount(SearchDto searchDto);
	
	//상세조회
	public Resume userInfoSelectOne(Resume resume);
	public Resume resumeSelectOne(int r_id);
	public Resume academicSelectOne(Resume resume);
	public Resume certificateSelectOne(Resume resume);
	public Resume careerSelectOne(Resume resume);
	public Resume educationSelectOne(Resume resume);
	public Resume specialTechSelectOne(Resume resume);
	public Resume skillInventorySelectOne(Resume resume);
	
	//r_id, u_id, d_id
	public Resume resumeInfomation(Resume resume);
	
}
