package com.javaex.basic.var;

public class ImplicitCastingEx {

	public static void main(String[] args) {
		
		byte b = 25; //1byte
		System.out.println(b);
		
		short s = b; //2byte
		System.out.println(s);
		
		int i = s; //4byte
		System.out.println(i);
		
		float f = i; //4byte
		System.out.println(f);
		
		double d = f; //8byte
		System.out.println(d);
		
	}

}
