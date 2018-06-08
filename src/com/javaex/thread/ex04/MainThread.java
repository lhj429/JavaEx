package com.javaex.thread.ex04;

public class MainThread extends Thread {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new DigitThread());
		Thread thread2 = new Thread(new AlphabetThread());

		thread.setPriority(Thread.MAX_PRIORITY); //max=10
		thread2.setPriority(Thread.MIN_PRIORITY); //min=1
		
		thread.start();
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
