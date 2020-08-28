package com.resume.dto;

public class Ceritificate {			//자격증
	
	private int r_id;					//이력관리번호
	private String ce_code;			//자격증 코드
	private String ce_text;			//자격증 수기입력
	
	
	
	public Ceritificate() {
		super();
	}



	public Ceritificate(int r_id, String ce_code, String ce_text) {
		super();
		this.r_id = r_id;
		this.ce_code = ce_code;
		this.ce_text = ce_text;
	}



	public int getR_id() {
		return r_id;
	}



	public void setR_id(int r_id) {
		this.r_id = r_id;
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



	@Override
	public String toString() {
		return "Ceritificate [r_id=" + r_id + ", ce_code=" + ce_code + ", ce_text=" + ce_text + "]";
	}
	
	

}//class end
