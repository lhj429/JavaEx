package com.javaex.reftype;

public class EnumEx {

	public static void main(String[] args) {
		
		Week today = Week.THURSDAY;
		
		System.out.printf("Today is %s(%d)%n", today.name(), today.ordinal());
		
		Week obj = Week.valueOf("FRIDAY");
		System.out.println(obj.name() + " " + obj.ordinal());

	}

}
