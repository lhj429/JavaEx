package com.javaex.reftype;

public class ArrayCopyFor {

	public static void main(String[] args) {

		int source[] = {1,2,3};
		int target[] = new int[10];
		
		for(int i=0; i<source.length; i++) {
			target[i] = source[i];
		}
		
		for( int i : source) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for( int i : target ) {
			System.out.print(i + " ");
		}
		
	}

}
