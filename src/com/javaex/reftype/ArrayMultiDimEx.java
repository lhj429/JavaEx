package com.javaex.reftype;

public class ArrayMultiDimEx {

	public static void main(String[] args) {

		int[][] twoDimen = new int[5][10];
		
		int table[][] = {
				{1,2,3,4,5,6,7,8,9,0},
				{2,3,4,5,6,7,8,9,0,1},
				{3,4,5,6,7,8,9,0,1,2},
				{4,5,6,7,8,9,0,1,2,3},
				{5,6,7,8,9,0,1,2,3,4},
		};
		
		System.out.println(table.length);
		System.out.println(table[0].length);
		
	}

}
