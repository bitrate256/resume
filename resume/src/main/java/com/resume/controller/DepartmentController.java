package com.resume.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resume.dto.BoardPager;
import com.resume.dto.Department;
import com.resume.dto.SearchDto;
import com.resume.dto.UserInfo;
import com.resume.service.DepartmentService;
import com.resume.service.UserInfoService;

@Controller
public class DepartmentController {
	
	
private static Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService service;
	
	//부서관리 페이지
	@RequestMapping(value = "admin/department")
	public String department() {
		

		
		return "admin/adminDepartment";
	}
	
	//부서이름 중복체크
	@RequestMapping(value = "admin/departmentCheck")
	@ResponseBody
	public String departmentCheck(Model model, Department department,
			@RequestParam("d_name")String d_name) {
		String path = "";
		int result = service.departmentOverlap(department);
		System.out.println(department);
		
		if(result > 0) {
			
			path = "1";
			
		}
		else {
			
			path = "0";
		}
		return path;
	}
	
	//부서 등록
	@RequestMapping(value = "admin/departmentInsert")
	public String departmentInsert(Department department, @RequestParam("d_name")String d_name) {
		String path = "";
		int result = service.departmentOverlap(department);
		
		if(result == 0) {
			service.departmentInsert(department);
			path = "redirect:/admin/adminDepartmentList";
		} else if(result > 0) {
			
			path = "redirect:/admin/department";
			
		}
		
		
		return path;
	}
	
	//부서 리스트
	@RequestMapping(value = "admin/adminDepartmentList")
	public String adminDepartmentList() {
		
		return "admin/adminDepartmentList";
	}
	
	
	//부서 리스트(ajax)
	@RequestMapping(value = "admin/adminDepartmentListAjax")
	public String adminDepartmentListAjax(Department dto, Model model) {
		
		List<Department> departmentAllList =  new ArrayList<Department>();
		departmentAllList = service.departmentList(dto);
		model.addAttribute("departmentAllList", departmentAllList);

		
		return "admin/ajax/adminDepartmentList_ajax";
	}
	
	//부서 상세보기
	@RequestMapping(value = "admin/adminDepartmentSelectOne")
	public String adminDepartmentSelectOne() {
		
		return "";
	}
	
	
}//class end
