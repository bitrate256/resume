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

		return "redirect:/resume/resumeList";
	}

	// 비동기 업로드 시작
	// 학력 업로드
	@RequestMapping(value = "resume/resumeInsertAcademic")
	@ResponseBody // 페이지 남기고 data만 리턴
	public String resumeInsertAcademic(Academic resume) {

		String data; // data에 넣어서 전달
		if (resume.getR_id() == 0) {
			data = "0";
		} else {
			data = "1";
			service.academicInsert(resume);
		}
		return data;
	}

	// 3. 자격증 업로드
	@RequestMapping(value = "resume/resumeInsertCerti")
	@ResponseBody // 페이지 남기고 data만 리턴
	public String resumeInsertCerti(Ceritificate resume) {

		String data; // data에 넣어서 전달
		if (resume.getR_id() == 0) {
			data = "0";
		} else {
			data = "1";
			service.certificateInsert(resume);
		}
		return data;
	}
	
	// 3. 자격증 수정
	/*
	 * @RequestMapping(value = "resume/resumeUpdateCerti")
	 * 
	 * @ResponseBody // 페이지 남기고 data만 리턴 public String
	 * resumeUpdateCerti(Ceritificate resume) {
	 * 
	 * String data; // data에 넣어서 전달 if (resume.getR_id() == 0) { data = "0"; } else
	 * { data = "1"; service.certificateUpdate(resume); } return data; }
	 */

	// 4. 경력 업로드
	@RequestMapping(value = "resume/resumeInsertCareer")
	@ResponseBody // 페이지 남기고 data만 리턴
	public String resumeInsertCareer(Career resume) {
		Career [] career = {};
		
		String data; // data에 넣어서 전달
		if (resume.getR_id() == 0) {
			data = "0";
		} else {
			data = "1";
			service.careerInsert(resume);
		}
		return data;
	}
	
	// 5. 교육 업로드
	@RequestMapping(value = "resume/resumeInsertEducation")
	@ResponseBody
	public String resumeInsertEducation(Education resume) {
		String data;
		if (resume.getR_id() == 0) {
			data = "0";
		} else {
			data = "1";
			service.educationInsert(resume);
		}
		return data;
	}
	
	// 6. 특수기술 업로드
	@RequestMapping(value = "resume/resumeInsertSpecialTech")
	@ResponseBody
	public String resumeInsertSpecialTech(SpecialTech resume) {
		String data;
		if (resume.getR_id() == 0) {
			data = "0";
		} else {
			data = "1";
			service.specialTechInsert(resume);
		}
		return data;
	}
	
	// 7. 스킬인벤토리 업로드
	@RequestMapping(value = "resume/resumeInsertSkillInventory")
	@ResponseBody
	public String resumeInsertSkillInventory(SkillInventory resume) {
		String data;
		if (resume.getR_id() == 0) {
			data = "0";
		} else {
			data = "1";
			service.skillInventoryInsert(resume);
		}
		return data;
	}

	// 비동기 업로드 끝

	// 이력 리스트
	@RequestMapping(value = "resume/resumeListAjax")
	public String resumeAllListAjax(@RequestParam(value = "cPage", defaultValue = "1") int cPage,
			@RequestParam(value = "searchSort", defaultValue = "") String searchSort,
			@RequestParam(value = "searchVal", defaultValue = "") String searchVal, Model model, HttpSession session) {
		logger.info("resumeAllListAjax 컨트롤러 찍음.");

		UserInfo resume = (UserInfo) session.getAttribute("resume");
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
		model.addAttribute("resumeAllList", resumeAllList);
		model.addAttribute("boardPager", boardPager);

		return "resume/ajax/resumeList_ajax";
	}

	// 이력 생성 직후 데이터 삽입 창
	@RequestMapping(value = "resume/resumeSelectOne")

	public String ResumeSelectOne(Model model, Resume resume, HttpSession session) {

		Resume resumeInfo = service.resumeSelectOne(resume);
		System.out.println("asdasd = " + resumeInfo);
		model.addAttribute("resumeInfo", resumeInfo);

		return "resume/resumeSelectOne";
	}

	// 이력 수정
	@RequestMapping(value = "user/resumeUpdateForm")
	public String ResumeUpdateFoem(Model model, Resume resume, HttpSession session) {

		Resume resumeInfo = service.resumeUpdateForm(resume);
		System.out.println("asdasd = " + resumeInfo);
		model.addAttribute("resumeInfo", resumeInfo);

		return "resume/resumeUpdateForm";
	}

	@RequestMapping(value = "user/resumeUpdateEnd")
	public String ResumeUpdateEnd() {

		return "resume/resumeSelectOne";
	}

	// 이력 삭제

}// class end
