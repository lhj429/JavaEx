package com.javaex.oop.staticmember;

public class Singleton {

	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return instance;
	}

	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}

}
