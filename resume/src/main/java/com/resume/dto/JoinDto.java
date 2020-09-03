package com.resume.dto;

public class JoinDto {

	// RESME (이력)
	private int r_id;
	private int u_id;
	private int d_id;
	private String r_status;
	private String r_newdate;
	
	// ACADEMIC (학력)
	private String a_hschool;
	private String a_university;
	private String a_gschool;
	private String a_hschooldate;
	private String a_universitydate;
	private String a_gschooldate;
	
	// CERTIFICATE (자격증)
	private String ce_code;
	private String ce_text;
	
	// CAREER (경력)
	private String c_name;
	private String c_start;
	private String c_end;
	private String c_position;
	private String c_task;
	
	// EDUCATION (교육)
	private String e_place;
	private String e_started;
	private String e_end;
	private String e_name;
	
	// SPECIAL_TECH (특수기술)
	private String st_ap;
	private String st_level;
	
	// SKILL_INVENTORY (기술 목록)
	private String si_name;
	private String si_start;
	private String si_end;
	private String st_customer;
	private String st_company;
	private String st_role;
	private String st_model;
	private String st_os;
	private String st_language;
	private String st_dbms;
	private String st_tool;
	private String st_etc;

	// FILE (파일)
	private String f_ori;
	private String f_save;
	private String f_size;
	
	
	
	
	public JoinDto() {
		super();
	}




	public JoinDto(int r_id, int u_id, int d_id, String r_status, String r_newdate, String a_hschool,
			String a_university, String a_gschool, String a_hschooldate, String a_universitydate, String a_gschooldate,
			String ce_code, String ce_text, String c_name, String c_start, String c_end, String c_position,
			String c_task, String e_place, String e_started, String e_end, String e_name, String st_ap, String st_level,
			String si_name, String si_start, String si_end, String st_customer, String st_company, String st_role,
			String st_model, String st_os, String st_language, String st_dbms, String st_tool, String st_etc,
			String f_ori, String f_save, String f_size) {
		super();
		this.r_id = r_id;
		this.u_id = u_id;
		this.d_id = d_id;
		this.r_status = r_status;
		this.r_newdate = r_newdate;
		this.a_hschool = a_hschool;
		this.a_university = a_university;
		this.a_gschool = a_gschool;
		this.a_hschooldate = a_hschooldate;
		this.a_universitydate = a_universitydate;
		this.a_gschooldate = a_gschooldate;
		this.ce_code = ce_code;
		this.ce_text = ce_text;
		this.c_name = c_name;
		this.c_start = c_start;
		this.c_end = c_end;
		this.c_position = c_position;
		this.c_task = c_task;
		this.e_place = e_place;
		this.e_started = e_started;
		this.e_end = e_end;
		this.e_name = e_name;
		this.st_ap = st_ap;
		this.st_level = st_level;
		this.si_name = si_name;
		this.si_start = si_start;
		this.si_end = si_end;
		this.st_customer = st_customer;
		this.st_company = st_company;
		this.st_role = st_role;
		this.st_model = st_model;
		this.st_os = st_os;
		this.st_language = st_language;
		this.st_dbms = st_dbms;
		this.st_tool = st_tool;
		this.st_etc = st_etc;
		this.f_ori = f_ori;
		this.f_save = f_save;
		this.f_size = f_size;
	}




	public int getR_id() {
		return r_id;
	}




	public void setR_id(int r_id) {
		this.r_id = r_id;
	}




	public int getU_id() {
		return u_id;
	}




	public void setU_id(int u_id) {
		this.u_id = u_id;
	}




	public int getD_id() {
		return d_id;
	}




	public void setD_id(int d_id) {
		this.d_id = d_id;
	}




	public String getR_status() {
		return r_status;
	}




	public void setR_status(String r_status) {
		this.r_status = r_status;
	}




	public String getR_newdate() {
		return r_newdate;
	}




	public void setR_newdate(String r_newdate) {
		this.r_newdate = r_newdate;
	}




	public String getA_hschool() {
		return a_hschool;
	}




	public void setA_hschool(String a_hschool) {
		this.a_hschool = a_hschool;
	}




	public String getA_university() {
		return a_university;
	}




	public void setA_university(String a_university) {
		this.a_university = a_university;
	}




	public String getA_gschool() {
		return a_gschool;
	}




	public void setA_gschool(String a_gschool) {
		this.a_gschool = a_gschool;
	}




	public String getA_hschooldate() {
		return a_hschooldate;
	}




	public void setA_hschooldate(String a_hschooldate) {
		this.a_hschooldate = a_hschooldate;
	}




	public String getA_universitydate() {
		return a_universitydate;
	}




	public void setA_universitydate(String a_universitydate) {
		this.a_universitydate = a_universitydate;
	}




	public String getA_gschooldate() {
		return a_gschooldate;
	}




	public void setA_gschooldate(String a_gschooldate) {
		this.a_gschooldate = a_gschooldate;
	}




	public String getCe_code() {
		return ce_code;
	}




	public void setCe_code(String ce_code) {
		this.ce_code = ce_code;
	}




	public String getCe_text() {
		return ce_text;
	}




	public void setCe_text(String ce_text) {
		this.ce_text = ce_text;
	}




	public String getC_name() {
		return c_name;
	}




	public void setC_name(String c_name) {
		this.c_name = c_name;
	}




	public String getC_start() {
		return c_start;
	}




	public void setC_start(String c_start) {
		this.c_start = c_start;
	}




	public String getC_end() {
		return c_end;
	}




	public void setC_end(String c_end) {
		this.c_end = c_end;
	}




	public String getC_position() {
		return c_position;
	}




	public void setC_position(String c_position) {
		this.c_position = c_position;
	}




	public String getC_task() {
		return c_task;
	}




	public void setC_task(String c_task) {
		this.c_task = c_task;
	}




	public String getE_place() {
		return e_place;
	}




	public void setE_place(String e_place) {
		this.e_place = e_place;
	}




	public String getE_started() {
		return e_started;
	}




	public void setE_started(String e_started) {
		this.e_started = e_started;
	}




	public String getE_end() {
		return e_end;
	}




	public void setE_end(String e_end) {
		this.e_end = e_end;
	}




	public String getE_name() {
		return e_name;
	}




	public void setE_name(String e_name) {
		this.e_name = e_name;
	}




	public String getSt_ap() {
		return st_ap;
	}




	public void setSt_ap(String st_ap) {
		this.st_ap = st_ap;
	}




	public String getSt_level() {
		return st_level;
	}




	public void setSt_level(String st_level) {
		this.st_level = st_level;
	}




	public String getSi_name() {
		return si_name;
	}




	public void setSi_name(String si_name) {
		this.si_name = si_name;
	}




	public String getSi_start() {
		return si_start;
	}




	public void setSi_start(String si_start) {
		this.si_start = si_start;
	}




	public String getSi_end() {
		return si_end;
	}




	public void setSi_end(String si_end) {
		this.si_end = si_end;
	}




	public String getSt_customer() {
		return st_customer;
	}




	public void setSt_customer(String st_customer) {
		this.st_customer = st_customer;
	}




	public String getSt_company() {
		return st_company;
	}




	public void setSt_company(String st_company) {
		this.st_company = st_company;
	}




	public String getSt_role() {
		return st_role;
	}




	public void setSt_role(String st_role) {
		this.st_role = st_role;
	}




	public String getSt_model() {
		return st_model;
	}




	public void setSt_model(String st_model) {
		this.st_model = st_model;
	}




	public String getSt_os() {
		return st_os;
	}




	public void setSt_os(String st_os) {
		this.st_os = st_os;
	}




	public String getSt_language() {
		return st_language;
	}




	public void setSt_language(String st_language) {
		this.st_language = st_language;
	}




	public String getSt_dbms() {
		return st_dbms;
	}




	public void setSt_dbms(String st_dbms) {
		this.st_dbms = st_dbms;
	}




	public String getSt_tool() {
		return st_tool;
	}




	public void setSt_tool(String st_tool) {
		this.st_tool = st_tool;
	}




	public String getSt_etc() {
		return st_etc;
	}




	public void setSt_etc(String st_etc) {
		this.st_etc = st_etc;
	}




	public String getF_ori() {
		return f_ori;
	}




	public void setF_ori(String f_ori) {
		this.f_ori = f_ori;
	}




	public String getF_save() {
		return f_save;
	}




	public void setF_save(String f_save) {
		this.f_save = f_save;
	}




	public String getF_size() {
		return f_size;
	}




	public void setF_size(String f_size) {
		this.f_size = f_size;
	}
	
	
	
}//class end
