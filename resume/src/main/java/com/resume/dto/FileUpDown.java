package com.resume.dto;

public class FileUpDown {							//파일
			
	
	private int r_id;						//이력관리 번호
	private String f_ori;					//원본파일 이름
	private String f_save;				//저장 파일 이름
	private String f_size;					//파일 크기
	
	
	
	public FileUpDown() {
		super();
	}



	public FileUpDown(int r_id, String f_ori, String f_save, String f_size) {
		super();
		this.r_id = r_id;
		this.f_ori = f_ori;
		this.f_save = f_save;
		this.f_size = f_size;
	}



	public int getR_id() {
		return r_id;
	}



	public void setR_id(int r_id) {
		this.r_id = r_id;
	}



	public String getF_ori() {
		return f_ori;
	}



	public void setF_ori(String f_ori) {
		this.f_ori = f_ori;
	}



	public String getF_save() {
		return f_save;
	}



	public void setF_save(String f_save) {
		this.f_save = f_save;
	}



	public String getF_size() {
		return f_size;
	}



	public void setF_size(String f_size) {
		this.f_size = f_size;
	}



	@Override
	public String toString() {
		return "FIle [r_id=" + r_id + ", f_ori=" + f_ori + ", f_save=" + f_save + ", f_size=" + f_size + "]";
	}
	
	
	
	
	
	
}//class end
