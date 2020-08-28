package com.resume.dto;

public class SpecialTech {				//특수기술
	
	private int r_id;						//이력관리 번호
	private String st_ap;					//사용가능 프로그램
	private String st_level;				//숙련도
	
	
	
	public SpecialTech() {
		super();
	}



	public SpecialTech(int r_id, String st_ap, String st_level) {
		super();
		this.r_id = r_id;
		this.st_ap = st_ap;
		this.st_level = st_level;
	}



	public int getR_id() {
		return r_id;
	}



	public void setR_id(int r_id) {
		this.r_id = r_id;
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



	@Override
	public String toString() {
		return "SpecialTech [r_id=" + r_id + ", st_ap=" + st_ap + ", st_level=" + st_level + "]";
	}
	
	
	
	
	
	
	
}//class end
