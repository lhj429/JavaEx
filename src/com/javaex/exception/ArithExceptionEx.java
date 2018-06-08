package com.javaex.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithExceptionEx {

	public static void main(String[] args) {

		double result = 0;
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력하세요:");

		try {
			num = sc.nextInt();
			result = 100 / num;
		} catch(InputMismatchException e) {
			System.out.println("정수로 해주세요");
		} catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없어요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally");
		}
		
		System.out.println(result);

		sc.close();

	}

}
