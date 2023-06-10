package com.inhatc.domain;

public class Criteria {
	private int page; // 현재 페이지 번호를 저장하는 변수 
	private int perPageNum;  // 페이지 당 항목 수를 저장하는 변수 
	
	public Criteria() {
		this.page = 1; 
		this.perPageNum = 10;  // 페이지 당 항목 수를 10으로 설정 
	}
	
	public int getPage() {  //현재 페이지 번호를 반환 
		return page;
	}
	public void setPage(int page) {  // 페이지 번호를 설정.만약 입력된 페이지 번호가 0 이하인 경우 1로설정 
		if (page <= 0) {
			this.page = 1;
			return;
		}
		this.page = page;
	}
	public int getPerPageNum() {  // 페이지 당 항목 수 반환 
		return perPageNum;
	}
	public void setPerPageNum(int perPageNum) {  // 페이지 당 항목 수가 0이하, 100 초과일 경우 10으로 설정
		if (perPageNum <= 0 | perPageNum > 100) {
			this.perPageNum = 10;
			return;
		}
		this.perPageNum = perPageNum;
		return;
	}
	
	public int getPageStart() {  // 현재 페이지의 시작 위치를 계산하여 반환 
		return (this.page - 1) * perPageNum;
	}
	
	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";  
	}
}
