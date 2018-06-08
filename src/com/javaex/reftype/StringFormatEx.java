package com.javaex.reftype;

public class StringFormatEx {

	public static void main(String[] args) {

		String fruit = "Apple";
		int total = 10;
		int eat = 3;
		
		System.out.println(10 + "개의" + fruit + "중에" + eat + "개를 먹었다.");
		System.out.printf("%d개의 %s중에 %s개를 먹었다.%n", total, fruit, eat);
		
		float pi = 3.14159f;
		System.out.printf("파이 값은 %f 입니다. %n", pi);
		System.out.printf("파이 값은 %.3f 입니다. %n", pi);
		
		
	}

}
