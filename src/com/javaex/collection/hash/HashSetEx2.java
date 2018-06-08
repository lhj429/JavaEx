package com.javaex.collection.hash;

import java.util.HashSet;

class SimpleNum {
	int num;

	public SimpleNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return String.valueOf(num);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SimpleNum) {
			SimpleNum other = (SimpleNum) obj;
			return num == other.num;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return num%10;
	}

}

public class HashSetEx2 {

	public static void main(String[] args) {

		HashSet<SimpleNum> hs = new HashSet<>();

		SimpleNum s1 = new SimpleNum(10);
		SimpleNum s2 = new SimpleNum(20);
		SimpleNum s3 = new SimpleNum(20);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		System.out.println(hs);

		System.out.println(s2.equals(s3));

	}

}
