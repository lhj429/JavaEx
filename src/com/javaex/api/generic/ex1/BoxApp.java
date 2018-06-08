package com.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {

		//Box 하나 만들고 int 값을 설정
		Box intBox = new Box();
		intBox.setContent(123);
		
		//값 꺼내기
		int retVal = (int)intBox.getContent();
		System.out.println(retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		String strVal = (String)strBox.getContent();
		System.out.println(strVal);
		
		strVal = (String)intBox.getContent();
		
	}

}
