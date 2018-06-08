package com.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {

		//Box 하나 만들고 int 값을 설정
		Box<Integer> intBox = new Box<>();
		intBox.setContent(123);
//		intBox.setContent("Java"); //컴파일 시 체크
		
		//값 꺼내기
		int retVal = intBox.getContent(); //캐스팅 불필요
		System.out.println(retVal);
		
		Box<String> strBox = new Box<>();
		strBox.setContent("Java");
		
		String strVal = strBox.getContent(); //캐스팅 불필요
		System.out.println(strVal);
		
//		strVal = (String)intBox.getContent(); //컴파일 시 체크 :안정성 확보
		
	}

}
