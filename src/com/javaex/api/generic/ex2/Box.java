package com.javaex.api.generic.ex2;

public class Box<T> {
	
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
