package com.resume.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JqGrid {

	private int page;
	private int records;
	private int total;
	private List<Map<String, Object>> rows = new ArrayList<Map<String,Object>>();
	
	
	
	public JqGrid() {
		super();
	}



	public JqGrid(int page, int records, int total, List<Map<String, Object>> rows) {
		super();
		this.page = page;
		this.records = records;
		this.total = total;
		this.rows = rows;
	}



	public int getPage() {
		return page;
	}



	public void setPage(int page) {
		this.page = page;
	}



	public int getRecords() {
		return records;
	}



	public void setRecords(int records) {
		this.records = records;
	}



	public int getTotal() {
		return total;
	}



	public void setTotal(int total) {
		this.total = total;
	}



	public List<Map<String, Object>> getRows() {
		return rows;
	}



	public void setRows(List<Map<String, Object>> rows) {
		this.rows = rows;
	}



	@Override
	public String toString() {
		return "JqGrid [page=" + page + ", records=" + records + ", total=" + total + ", rows=" + rows + "]";
	}
	
	
	
	
	
	
	
}//class end
