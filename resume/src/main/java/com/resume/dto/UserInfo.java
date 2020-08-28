package com.resume.dto;

public class UserInfo {				//사용자 정보
	
	private int u_id;									//사번
	private int d_id;									//부서코드
	private int r_id;									//이력관리번호
	private String u_pwd;							//비밀번호
	private int u_rnumber;							//주민등록번호
	private String u_company;					//회사이름
	private String u_marry;							//결혼여부
	private String u_position;						//직위
	private String u_ms;								//병역
	private String u_career;							//경력
	private String u_tgrade;						//기술등급
	private String u_phone;							//핸드폰번호
	private String u_email;							//이메일
	private String u_address;						//주소
	private String u_status;							//재직상태
	
	

	public UserInfo() {
		super();
	}



	public UserInfo(int u_id, int d_id, int r_id, String u_pwd, int u_rnumber, String u_company, String u_marry,
			String u_position, String u_ms, String u_career, String u_tgrade, String u_phone, String u_email,
			String u_address, String u_status) {
		super();
		this.u_id = u_id;
		this.d_id = d_id;
		this.r_id = r_id;
		this.u_pwd = u_pwd;
		this.u_rnumber = u_rnumber;
		this.u_company = u_company;
		this.u_marry = u_marry;
		this.u_position = u_position;
		this.u_ms = u_ms;
		this.u_career = u_career;
		this.u_tgrade = u_tgrade;
		this.u_phone = u_phone;
		this.u_email = u_email;
		this.u_address = u_address;
		this.u_status = u_status;
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



	public String getU_pwd() {
		return u_pwd;
	}



	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}



	public int getU_rnumber() {
		return u_rnumber;
	}



	public void setU_rnumber(int u_rnumber) {
		this.u_rnumber = u_rnumber;
	}



	public String getU_company() {
		return u_company;
	}



	public void setU_company(String u_company) {
		this.u_company = u_company;
	}



	public String getU_marry() {
		return u_marry;
	}



	public void setU_marry(String u_marry) {
		this.u_marry = u_marry;
	}



	public String getU_position() {
		return u_position;
	}



	public void setU_position(String u_position) {
		this.u_position = u_position;
	}



	public String getU_ms() {
		return u_ms;
	}



	public void setU_ms(String u_ms) {
		this.u_ms = u_ms;
	}



	public String getU_career() {
		return u_career;
	}



	public void setU_career(String u_career) {
		this.u_career = u_career;
	}



	public String getU_tgrade() {
		return u_tgrade;
	}



	public void setU_tgrade(String u_tgrade) {
		this.u_tgrade = u_tgrade;
	}



	public String getU_phone() {
		return u_phone;
	}



	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}



	public String getU_email() {
		return u_email;
	}



	public void setU_email(String u_email) {
		this.u_email = u_email;
	}



	public String getU_address() {
		return u_address;
	}



	public void setU_address(String u_address) {
		this.u_address = u_address;
	}



	public String getU_status() {
		return u_status;
	}



	public void setU_status(String u_status) {
		this.u_status = u_status;
	}



	@Override
	public String toString() {
		return "UserInfo [u_id=" + u_id + ", d_id=" + d_id + ", r_id=" + r_id + ", u_pwd=" + u_pwd + ", u_rnumber="
				+ u_rnumber + ", u_company=" + u_company + ", u_marry=" + u_marry + ", u_position=" + u_position
				+ ", u_ms=" + u_ms + ", u_career=" + u_career + ", u_tgrade=" + u_tgrade + ", u_phone=" + u_phone
				+ ", u_email=" + u_email + ", u_address=" + u_address + ", u_status=" + u_status + "]";
	}
	
	
	
	
	
	
}//class end
