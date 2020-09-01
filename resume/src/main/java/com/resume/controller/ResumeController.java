package com.resume.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResumeController {
	
	// 이력 리스트 화면
	@RequestMapping(value = "resume/resumeList")
	public String resumeList() {
		
		return "resume/resumeList";
	}
	
	// 이력 업로드
	
	// 이력 전체 레코드 갯수

	// 이력 전체 리스트
	
	// 이력 상세 보기
	
	// 이력 수정
	
	// 이력 삭제
	
}//class end
