package com.resume.dto;

public class Resume {				//이력서
	
	private int r_id;					// 이력관리번호
	private int u_id;					// 사번
	private int d_id;					// 부서코드
	private String r_status;			// 이력서 상태
	private String r_newdate;		    // 이력서수정날짜
	
	
	
	public Resume() {
		super();
	}



	public Resume(int r_id, int u_id, int d_id, String r_status, String r_newdate) {
		super();
		this.r_id = r_id;
		this.u_id = u_id;
		this.d_id = d_id;
		this.r_status = r_status;
		this.r_newdate = r_newdate;
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



	@Override
	public String toString() {
		return "Resume [r_id=" + r_id + ", u_id=" + u_id + ", d_id=" + d_id + ", r_status=" + r_status + ", r_newdate=" + r_newdate + "]";
	}
	
	
	
	
}//class ends
