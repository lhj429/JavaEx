package com.javaex.oop.shape.v1;

public class Circle extends Shape {

	protected double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, area=%f]을 그렸습니다.%n", x, y, area());
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
