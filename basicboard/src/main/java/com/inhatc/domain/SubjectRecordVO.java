package com.inhatc.domain;

public class SubjectRecordVO {
	private String stuID;
	private int kor;
	private int eng;
	private int mat;
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	@Override
	public String toString() {
		return "SubjectRecordVO [stuID=" + stuID + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	
}
