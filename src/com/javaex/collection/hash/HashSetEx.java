package com.javaex.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println(hs);
		System.out.println("hs size=" + hs.size());
		
		System.out.println(hs.contains("Java"));
		System.out.println(hs.contains("Linux"));
		
		hs.remove("C++");
		System.out.println(hs);
	}

}
