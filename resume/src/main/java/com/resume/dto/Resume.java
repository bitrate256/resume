package com.resume.dto;

public class Resume {				//이력서
	
	private int r_id;					//이력관리번호
	private String r_status;			//이력서 상태
	private String r_newdate;		//이력서수정날짜
	
	
	
	public Resume() {
		super();
	}



	public Resume(int r_id, String r_status, String r_newdate) {
		super();
		this.r_id = r_id;
		this.r_status = r_status;
		this.r_newdate = r_newdate;
	}



	public int getR_id() {
		return r_id;
	}



	public void setR_id(int r_id) {
		this.r_id = r_id;
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



	@Override
	public String toString() {
		return "Resume [r_id=" + r_id + ", r_status=" + r_status + ", r_newdate=" + r_newdate + "]";
	}
	
	
	
	
}//class ends
