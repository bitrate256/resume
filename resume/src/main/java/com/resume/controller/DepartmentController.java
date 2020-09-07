package com.resume.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resume.dto.Department;
import com.resume.service.DepartmentService;
import com.resume.service.UserInfoService;

@Controller
public class DepartmentController {
	
	
private static Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	private DepartmentService service;
	
	
	@RequestMapping(value = "admin/department")
	public String department() {
		

		
		return "admin/adminDepartment";
	}
	
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
	
	@RequestMapping(value = "admin/departmentInsert")
	public String departmentInsert(Department department) {
		
		service.departmentInsert(department);
		
		
		
		return "redirect:/admin/department";
	}
	
	
}//class end
