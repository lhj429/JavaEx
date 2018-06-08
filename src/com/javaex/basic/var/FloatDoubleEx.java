package com.javaex.basic.var;

public class FloatDoubleEx {

	public static void main(String[] args) {
		float floatVar = 3.14159F;
		double doubleVar = 3.14159;
		
//		정밀도 체크
		doubleVar = 0.1234567890123456789;
		floatVar = 0.1234567890123456789F;
		System.out.println("float:" + floatVar);
		System.out.println("double:" + doubleVar);
		
//		e 사용한 표현
		int intVar = 3000000;
		doubleVar = 3E6;
		floatVar = 3E6F;
		System.out.println("int:" + intVar);
		System.out.println("double:" + doubleVar);
		System.out.println("float:" + floatVar);
		
//		부동소수점 계산의 유의점
		System.out.println(0.1*3);
	}

}
