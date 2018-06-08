package com.javaex.conditional;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요:");
		
		int score = sc.nextInt();
		
		if(score>=60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
		
	}

}
