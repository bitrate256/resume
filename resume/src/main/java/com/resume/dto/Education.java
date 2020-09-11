package com.resume.dto;

public class Education {					//교육
	
	private int u_id;
	private int d_id;		
	private int r_id;								//이력관리 번호
	private String e_place;					//교육 장소
	private String e_started;				//교육 시작일
	private String e_end;					//교육 종료일
	private String e_name;					//교육명
	
	
	
	public Education() {
		super();
	}



	public Education(int r_id, int u_id, int d_id, String e_place, String e_started, String e_end, String e_name) {
		super();
		this.u_id = u_id;
		this.d_id = d_id;
		this.r_id = r_id;
		this.e_place = e_place;
		this.e_started = e_started;
		this.e_end = e_end;
		this.e_name = e_name;
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



	@Override
	public String toString() {
		return "Education [u_id=" + u_id + ", d_id= " + d_id + ",r_id= " + r_id + ", e_place=" + e_place + ", e_started=" + e_started + ", e_end=" + e_end
				+ ", e_name=" + e_name + "]";
	}
	
	
	
	
	
	
	
	
	
	
}	//class end
