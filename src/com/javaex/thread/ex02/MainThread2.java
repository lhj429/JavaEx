package com.javaex.thread.ex02;

public class MainThread2 extends Thread {

	public static void main(String[] args) {

		// 메인 쓰레드 코드
		// AlphabetThread로 이동
		/*for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);

			// 출력 속도 지연
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		Thread thread = new DigitThread();
		thread.start();
		
		Thread thread2 = new AlphabetThread();
		thread2.start();
		
		//thread와 thread2를 메인 쓰레드의 흐름에 합류
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");

	}

}
