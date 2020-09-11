package com.resume.dto;

public class SkillInventory {			//기술 목록
	
	private int si_seq;
	private int u_id;
	private int d_id;		
	private int r_id;						//이력관리 번호
	private String si_name;				//프로젝트명
	private String si_start;				//프로젝트 시작일
	private String si_end;				//프로젝트 종료일
	private String customer;			//고객사
	private String si_company;		//근무회사
	private String si_role;				//역할
	private String si_model;			//기종
	private String si_os;					//운영체제
	private String is_language;		//사용언어
	private String si_dbms;				//사용 데이터베이스
	private String si_tool;				//사용 툴
	private String si_etc;					//기타
	
	
	public SkillInventory() {
		super();
	}
	
	public int getSi_seq() {
		return si_seq;
	}
	public void setSi_seq(int si_seq) {
		this.si_seq = si_seq;
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
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
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
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getSi_company() {
		return si_company;
	}
	public void setSi_company(String si_company) {
		this.si_company = si_company;
	}
	public String getSi_role() {
		return si_role;
	}
	public void setSi_role(String si_role) {
		this.si_role = si_role;
	}
	public String getSi_model() {
		return si_model;
	}
	public void setSi_model(String si_model) {
		this.si_model = si_model;
	}
	public String getSi_os() {
		return si_os;
	}
	public void setSi_os(String si_os) {
		this.si_os = si_os;
	}
	public String getIs_language() {
		return is_language;
	}
	public void setIs_language(String is_language) {
		this.is_language = is_language;
	}
	public String getSi_dbms() {
		return si_dbms;
	}
	public void setSi_dbms(String si_dbms) {
		this.si_dbms = si_dbms;
	}
	public String getSi_tool() {
		return si_tool;
	}
	public void setSi_tool(String si_tool) {
		this.si_tool = si_tool;
	}
	public String getSi_etc() {
		return si_etc;
	}
	public void setSi_etc(String si_etc) {
		this.si_etc = si_etc;
	}

	@Override
	public String toString() {
		return "SkillInventory [si_seq=" + si_seq + ", u_id=" + u_id + ", d_id=" + d_id + ", r_id=" + r_id
				+ ", si_name=" + si_name + ", si_start=" + si_start + ", si_end=" + si_end + ", customer=" + customer
				+ ", si_company=" + si_company + ", si_role=" + si_role + ", si_model=" + si_model + ", si_os=" + si_os
				+ ", is_language=" + is_language + ", si_dbms=" + si_dbms + ", si_tool=" + si_tool + ", si_etc="
				+ si_etc + "]";
	}
	
	
}//class end
