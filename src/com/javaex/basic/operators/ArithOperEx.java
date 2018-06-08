package com.javaex.basic.operators;

public class ArithOperEx {

	public static void main(String[] args) {

		int a = 7;
		int b = 3;
		
		System.out.println(-a);
		System.out.println(-1 * a);
		
		System.out.println("-----------------");
		
		a = 7;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		System.out.println("-----------------");
		
		System.out.println((float)a/(float)b);
		System.out.println((float)a/b);
		
		System.out.println("-----------------");
		
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(b++);
		System.out.println(a);
		
		System.out.println("-----------------");
		
//		System.out.println(4/0); //ArithmeticException
		System.out.println(4.0/0);
		
		System.out.println(7 % 4);
		System.out.println(7.2 % 2.0); //문제 있는 연산
		
		System.out.println(Double.isInfinite(4.0/0));
		System.out.println(Double.isNaN(4.0/0));
	}

}
