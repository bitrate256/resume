package com.resume.dto;

public class Career {					//경력
	
	private int r_id; 						//이력관리 번호
	private String c_name;				//근무회사명
	private String c_start;				//입사일
	private String c_end;				//퇴사일
	private String c_position;			//직위
	private String c_task;				//담당업무
	
	
	
	public Career() {
		super();
	}



	public Career(int r_id, String c_name, String c_start, String c_end, String c_position, String c_task) {
		super();
		this.r_id = r_id;
		this.c_name = c_name;
		this.c_start = c_start;
		this.c_end = c_end;
		this.c_position = c_position;
		this.c_task = c_task;
	}



	public int getR_id() {
		return r_id;
	}



	public void setR_id(int r_id) {
		this.r_id = r_id;
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



	@Override
	public String toString() {
		return "Career [r_id=" + r_id + ", c_name=" + c_name + ", c_start=" + c_start + ", c_end=" + c_end
				+ ", c_position=" + c_position + ", c_task=" + c_task + "]";
	}
	
	
	
	
	
	
}//class end
