package com.inhatc.domain;

public class Week03_ProductVO {  // VO : Value Object
	// 멤버 변수 선언
	private String name; // 제품 이름
	private double price; // 제품 가격 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	// 생성자 
	public Week03_ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Week03_ProductVO [name=" + name + ", price=" + price + "]";
	}
	
}
