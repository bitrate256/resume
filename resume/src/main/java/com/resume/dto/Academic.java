package com.resume.dto;

public class Academic {		//학력
	
	private int r_id;							//이력관리 번호
	private int u_id;
	private int d_id;
	private String a_hschool;				//고등학교 이름
	private String a_hschooldate;		//고등학교 졸업 날짜

	
	
	
	public Academic() {
		super();
	}




	public Academic(int r_id, int u_id, int d_id, String a_hschool, String a_hschooldate) {
		super();
		this.r_id = r_id;
		this.u_id = u_id;
		this.d_id = d_id;
		this.a_hschool = a_hschool;
		this.a_hschooldate = a_hschooldate;
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




	public String getA_hschool() {
		return a_hschool;
	}




	public void setA_hschool(String a_hschool) {
		this.a_hschool = a_hschool;
	}




	public String getA_hschooldate() {
		return a_hschooldate;
	}




	public void setA_hschooldate(String a_hschooldate) {
		this.a_hschooldate = a_hschooldate;
	}




	@Override
	public String toString() {
		return "Academic [r_id=" + r_id + ", u_id=" + u_id + ", d_id=" + d_id + ", a_hschool=" + a_hschool
				+ ", a_hschooldate=" + a_hschooldate + "]";
	}



	
	
	
}//class end
