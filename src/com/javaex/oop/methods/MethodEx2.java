package com.javaex.oop.methods;

public class MethodEx2 {
	
	public static void main(String[] args) {
		System.out.println(getSum(new double[] {
				1,2,3,4,5,6,7,8,9,0
		}));
		
		System.out.println(getSumVar(1, 2, 3, 4 ,5));
	}
	
	public static double getSum(double[] values) {
		double total = 0;
		for(int i=0; i<values.length; i++) {
			total += values[i];
		}
		return total;
	}
	
	//가변 인수를 이용한 다수의 인수 전달
	public static double getSumVar(double ... values) {
		/*double total = 0;
		for(double value:values) {
			total += value;
		}*/
		return getSum(values);
	}
	
	public static void printTotal(String message, double ... values) {
		System.out.println(message + " " + getSumVar(values));
	}

}
