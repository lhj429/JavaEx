package com.javaex.api.arrays;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {

		char src[] = "Java Programming".toCharArray();
		
		//copy by System
		char target[] = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		
		System.out.println(target);
		
		//copy by Arrays.copyOf
		target = Arrays.copyOf(src, src.length);
		System.out.println(target);
		
		//partial copy
		target = Arrays.copyOfRange(src, 5, src.length);
		System.out.println(target);
		
	}

}
