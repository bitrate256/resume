package com.resume.dto;

public class Ceritificate {			//자격증
	
	private int u_id;
	private int d_id;		
	private int r_id;					//이력관리번호
	private String ce_text;			//자격증 수기입력
	
	
	
	public Ceritificate() {
		super();
	}



	public Ceritificate(int r_id, int u_id, int d_id, String ce_text) {
		super();
		this.u_id = u_id;
		this.d_id = d_id;
		this.r_id = r_id;
		this.ce_text = ce_text;
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

	public String getCe_text() {
		return ce_text;
	}

	public void setCe_text(String ce_text) {
		this.ce_text = ce_text;
	}



	@Override
	public String toString() {
		return "Ceritificate [u_id=" + u_id + ", d_id= " + d_id + ",r_id= " + r_id + ", ce_text=" + ce_text + "]";
	}
	
	

}//class end
