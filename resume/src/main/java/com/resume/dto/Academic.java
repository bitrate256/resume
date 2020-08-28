package com.resume.dto;

public class Academic {		//학력
	
	private int r_id;							//이력관리 번호
	private String a_hschool;				//고등학교 이름
	private String a_university;			//대학교 이름
	private String a_gschool;				//대학원 이름
	private String a_hschooldate;		//고등학교 졸업 날짜
	private String a_universitydate;		//대힉교 졸업 날짜
	private String a_gschooldate;		//대학원 졸업 날짜
	
	
	
	public Academic() {
		super();
	}



	public Academic(int r_id, String a_hschool, String a_university, String a_gschool, String a_hschooldate,
			String a_universitydate, String a_gschooldate) {
		super();
		this.r_id = r_id;
		this.a_hschool = a_hschool;
		this.a_university = a_university;
		this.a_gschool = a_gschool;
		this.a_hschooldate = a_hschooldate;
		this.a_universitydate = a_universitydate;
		this.a_gschooldate = a_gschooldate;
	}



	public int getR_id() {
		return r_id;
	}



	public void setR_id(int r_id) {
		this.r_id = r_id;
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



	@Override
	public String toString() {
		return "Academic [r_id=" + r_id + ", a_hschool=" + a_hschool + ", a_university=" + a_university + ", a_gschool="
				+ a_gschool + ", a_hschooldate=" + a_hschooldate + ", a_universitydate=" + a_universitydate
				+ ", a_gschooldate=" + a_gschooldate + "]";
	}
	
	
	
}//class end
