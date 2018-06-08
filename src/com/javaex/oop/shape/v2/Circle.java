package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable {

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
