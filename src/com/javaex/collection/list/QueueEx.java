package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0; i<10; i++) {
			queue.offer(i);
		}

		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
