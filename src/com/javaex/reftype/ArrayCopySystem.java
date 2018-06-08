package com.javaex.reftype;

public class ArrayCopySystem {

	public static void main(String[] args) {

		int source[] = {1,2,3};
		int target[] = new int[10];
		
		System.arraycopy(source, 0, target, 3, 3);
		
		for(int i : target) {
			System.out.print(i + " ");
		}
			
		
	}

}
