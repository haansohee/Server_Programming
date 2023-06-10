package com.inhatc.domain;

public class Menu202144020VO {
	private int menuID;
	private String category;
	private String name;
	private int price;
	private int calorie;
	
	public int getMenuID() {
		return menuID;
	}
	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCalorie() {
		return calorie;
	}
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	
	@Override
	public String toString() {
		return "MenuVO [menuID=" + menuID + ", category=" + category + ", name=" + name + ", price=" + price
				+ ", calorie=" + calorie + "]";
	}
	
}
