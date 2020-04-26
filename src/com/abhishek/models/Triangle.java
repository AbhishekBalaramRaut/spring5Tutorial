package com.abhishek.models;

public class Triangle {

	private String type;
	private Point point1;
	private Point point2;
	private Point point3;

	public Triangle() {
		
	}
	public Triangle(String type) {
		System.out.println("cons 1");
		this.type = type;
	}

	public Triangle(String type, int height) {
		System.out.println("cons 3");
		this.type = type;

	}

	public Triangle(int height, String type) {

		this.type = type;

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public void draw() {
		System.out.println(type+" Triangle drawn ");
		System.out.println(" Point 1 ("+point1.getPointX()+","+point1.getPointY()+")");
		System.out.println(" Point 2 ("+point2.getPointX()+","+point2.getPointY()+")");
		System.out.println(" Point 3 ("+point3.getPointX()+","+point3.getPointY()+")");
	}
}
