package com.resume.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.resume.dto.UserInfo;
import com.resume.service.UserInfoService;



@Controller
public class UserInfoController {
	
	private static Logger logger = LoggerFactory.getLogger(UserInfoController.class);
	
	@Autowired
	private UserInfoService service;
	
	// 사용자 홈 화면
	@RequestMapping(value = "userHome")
	public String userHome() {
		logger.info("this is userHome method");

		
		
		return "user/userHome";
	}
	
	// 사용자 로그인 화면
	@RequestMapping(value = "user/userlogin")
	public String userlogin(Model model) {
		logger.info("this is userlogin method");
		
		
		
		return "user/user_login";
	}
	
	// 사용자 로그인
	@RequestMapping(value = "user/userloginEnd")
	public String userloginEnd(Model model, UserInfo user, HttpSession session) {
		logger.info("this is a userloginEnd method");
		
		UserInfo result = service.userSelectOne(user);
		String path = "";
		
		if(result !=null) {
			if(user.getU_pwd().equals(result.getU_pwd())) {
				path = "redirect:/userHome";
				
				session.setAttribute("loginUser", result);
				
			}
		}
		
		return path;
	}
	
	// 사용자 로그아웃
	@RequestMapping(value = "user/userlogout")
	public String userlogOut(HttpSession session) {
		
		logger.info("this is a userlogOut method");
		if(session.getAttribute("loginUser") !=null) {
			session.removeAttribute("loginUser");
		}
		
		return "redirect:/userHome";
	}
	
	@RequestMapping(value = "user/myPage")
	public String yPage(Model model, HttpSession session) {
		UserInfo user = (UserInfo) session.getAttribute("loginUser");
		model.addAttribute("loginUser",user);
		
		
		return "user/myPage";
	}
	
	@RequestMapping(value = "user/userInfoUpdateEnd")
	public String userInfoUpdate(UserInfo uDto) {
		
		service.userInfoUpdate(uDto);
		
		return "forward:/user/myPage";
	}

	
	
	
//------------------------------------------------------------------------------관리자------------------------------------------------------------------------------	
	
	@RequestMapping(value = "user/userSignUp")
	public String userSignUp() {
		
		
		
		return "user/user_SignUp";
	}
	
	@RequestMapping(value = "user/userJuso")
	public String userJuso() {
		return "user/jusoPopup";
	}
	
	@RequestMapping(value = "user/userSignUpResult")
	public String userSignUpResult(UserInfo uDto, @RequestParam("u_rnumber1") String u_rnumber1,
			@RequestParam("u_rnumber2") String u_rnumber2) {
		System.out.println("컨트롤러  user정보 = "+uDto);
		String u_rnumber = u_rnumber1+u_rnumber2;
		uDto.setU_rnumber(u_rnumber);
		System.out.println(uDto.getU_rnumber());
		service.userInsert(uDto);
		
		return "redirect:/user/userlogin";
	}
	
	@RequestMapping(value = "admin/department")
	public String department() {
		
		
		return "admin/adminDepartment";
	}
	
	
}//class end
