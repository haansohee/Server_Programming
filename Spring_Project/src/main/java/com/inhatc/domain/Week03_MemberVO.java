package com.inhatc.domain;

public class Week03_MemberVO {
	private String name;
	private String id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Week03_MemberVO(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Week03_MemberVO [name=" + name + ", id=" + id + "]";
	}
	
	
}
