package com.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.resume.dto.BoardPager;
import com.resume.dto.JoinDto;
import com.resume.dto.Resume;
import com.resume.dto.SearchDto;
import com.resume.dto.UserInfo;
import com.resume.service.ResumeService;

@Controller
public class ResumeController {
	
	private static Logger logger = LoggerFactory.getLogger(ResumeController.class);
	
	@Autowired
	private ResumeService service;
	

	
	// 이력 리스트 화면
	@RequestMapping(value = "resume/resumeList")
	public String resumeList(HttpSession session, Model model) {
		UserInfo user = (UserInfo) session.getAttribute("loginUser");
		model.addAttribute("loginUser", user);
		
		return "resume/resumeList";
	}
	
	// 이력 업로드 화면
	@RequestMapping(value = "resume/resumeCreate")
	public String resumeCreate(HttpSession session, Model model, Resume resume) {
		UserInfo user = (UserInfo) session.getAttribute("loginUser");
		model.addAttribute("loginUser", user);
		resume.setU_id(user.getU_id());
		resume.setD_id(user.getD_id());
		service.resumeInsert(resume);
//		Resume info =  service.resumeInfomation(resume);
//		System.out.println(info);
//		
//		model.addAttribute("info", info);
		
		
		return "resume/resumeCreate";
	}
	
	// 이력 업로드
	@RequestMapping(value = "resume/resumeInsert")
	public String resumeInsert(Resume resume) {
		logger.info("resumeInsert controller");
		
		service.academicInsert(resume);
		service.certificateInsert(resume);
		service.careerInsert(resume);
		service.educationInsert(resume);
		service.specialTechInsert(resume);
		service.skillInventoryInsert(resume);
		service.fileInsert(resume);
		
		return "redirect:/resume/resumeList";
	}

	// 이력 리스트
	@RequestMapping(value = "resume/resumeAllListAjax")
	public String resumeAllListAjax(@RequestParam(value = "cPage", defaultValue = "1") int cPage,
			@RequestParam(value = "searchSort", defaultValue = "") String searchSort,
			@RequestParam(value = "searchVal", defaultValue = "") String searchVal, Model model, HttpSession session) {
		logger.info("resumeAllListAjax 메소드임.");
		
		Resume resume = (Resume) session.getAttribute("loginUser");
		model.addAttribute("resume", resume);

		// 검색 객체 값 넣기
		SearchDto searchDto = new SearchDto(searchSort, searchVal);

		// 총 레코드 가져오기
		int nCount = service.selectResumeCount(searchDto);

		// 현재 출력 페이지
		int curPage = cPage;

		// 페이지 객체에 값 저장
		BoardPager boardPager = new BoardPager(nCount, curPage);

		// 페이지 겍체에 검색 정보 저장
		boardPager.setSearchSort(searchSort);
		boardPager.setSearchVal(searchVal);

		// 전체 리스트 출력
		List<JoinDto> resumeAllList = service.selectAllResumeList(boardPager);
		System.out.println(resumeAllList);
		model.addAttribute("statusAllList", resumeAllList);
		model.addAttribute("boardPager", boardPager);

		return "work/ajax/userStatusList_ajax";
	}
	
	// 이력 상세 보기
	@RequestMapping(value = "resume/resumeSelectOne")
	public String ResumeSelectOne(Model model, int r_id , HttpSession session) {
		
		UserInfo user = (UserInfo) session.getAttribute("loginUser");
		model.addAttribute("user", user);
		
		Resume resume = service.resumeSelectOne(r_id);
		model.addAttribute("resume", resume);
		System.out.println(resume);
		
		
		return "resume/resumeSelectOne";
	}
	
	// 이력 수정
	
	// 이력 삭제
	
}//class end
