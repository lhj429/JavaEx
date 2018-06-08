package com.javaex.oop.staticmember;

public class CalculatorApp {

	public static void main(String[] args) {

		double area = 10*10*Calculator.PI;
		double total = Calculator.getsum(1,2,3,4,5,6,7,8);
		
		System.out.println(area);
		System.out.println(total);
		
	}

}
