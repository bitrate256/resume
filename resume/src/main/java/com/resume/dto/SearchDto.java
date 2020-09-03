package com.resume.dto;

public class SearchDto {
	
	private String searchSort;
	private String searchVal;
	private int u_id;
	
	
	public SearchDto(String searchSort, String searchVal) {
		super();
		this.searchSort = searchSort;
		this.searchVal = searchVal;
	}


	public String getSearchSort() {
		return searchSort;
	}


	public void setSearchSort(String searchSort) {
		this.searchSort = searchSort;
	}


	public String getSearchVal() {
		return searchVal;
	}


	public void setSearchVal(String searchVal) {
		this.searchVal = searchVal;
	}


	public int getU_id() {
		return u_id;
	}


	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	
	
	
	
	
	
}//class end
