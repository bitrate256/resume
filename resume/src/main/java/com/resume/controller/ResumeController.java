package com.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.resume.dto.Resume;
import com.resume.service.ResumeService;

@Controller
public class ResumeController {
	
	private static Logger logger = LoggerFactory.getLogger(ResumeController.class);
	
	private ResumeService service;
	
	private 
	
	// 이력 리스트 화면
	@RequestMapping(value = "resume/resumeList")
	public String resumeList() {
		
		return "resume/resumeList";
	}
	
	// 이력 업로드 화면
	@RequestMapping(value = "resume/resumeCreate")
	public String resumeCreate() {
		
		return "resume/resume_Create";
	}
	
	// 이력 업로드
	@RequestMapping(value = "resume/resumeInsert")
	public String resumeInsert(Resume resume) {
		logger.info("resumeInsert controller");
		
		service.resumeInsert(resume);
		
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
		return "resume/??";
		// Ajax 처리 잠시 보류.

	}
	
	// 이력 리스트 2
	@Inject
	private ResumeService resumeService;
	
	@RequestMapping(value = "/getResumeList", method = RequestMethod.GET)
	public String getResumeList(Model model) throws Exception {
		model.addAttribute("resumeList", resumeService.getResumeList());
		return "resume/resumeList";
	}

	
	// 이력 상세 보기
	
	// 이력 수정
	
	// 이력 삭제
	
}//class end
