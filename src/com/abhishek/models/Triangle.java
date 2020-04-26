package com.abhishek.models;

public class Triangle {

	private String type;
	private int height;
	
	public Triangle(String type) {
		System.out.println("cons 1");
		this.type = type;
	}
	
	public Triangle(int height) {
		System.out.println("cons 2");
		this.height = height;
	} 
	
	public Triangle(String type,int height) {
		System.out.println("cons 3");
		this.type = type;
		this.height = height;
	}
	
	public Triangle(int height,String type) {
		System.out.println("cons 4");
		this.type = type;
		this.height = height;
	}
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("Triangle drawn "+this.getType()+ " , "+this.getHeight());
	}
}
