package com.abhishek.models;

public class Point {
	private int pointX;
	private int pointY;
	
	public int getPointX() {
		return pointX;
	}
	public void setPointX(int pointX) {
		this.pointX = pointX;
	}
	public int getPointY() {
		return pointY;
	}
	public void setPointY(int pointY) {
		this.pointY = pointY;
	}
	
	public void myInitDef() throws Exception {
		System.out.println("myinitDef pt");
	}
	
	public void myDestroyDef() throws Exception {
		System.out.println("myDestroyDef pt");
	}
}
