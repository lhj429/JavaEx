package com.javaex.oop.point.v3;

public class Point {

	private int x;
	private int y;

	public Point() {}
	public Point(int x, int y) {
		this(); //자기 자신의 다른 생성자
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("점[x=%d,y=%d]을 그렸습니다.%n", x, y);
	}
	
	public void draw(boolean show) {
		String message = String.format("점[x=%d,y=%d]을 ", x, y);
		if(show) {
			message += "그렸습니다.";
		} else {
			message += "지웠습니다.";
		}
		System.out.println(message);
	}

}
