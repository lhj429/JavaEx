package com.javaex.thread.ex03;

public class MainThread extends Thread {

	public static void main(String[] args) {
		
//		Thread thread = new DigitThread();
		Thread thread = new Thread(new DigitThread());
		thread.start();
		
//		Thread thread2 = new AlphabetThread();
		Thread thread2 = new Thread(new AlphabetThread());
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
