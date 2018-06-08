package com.javaex.api.stringclass;

public class StringBufferEx {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("This"); //버퍼 생성
		
		sb.append(" is pencil"); //문자열 추가
		
		sb.insert(8, "my"); //문자열 삽입
		
		sb.replace(8, 10, "your "); //문자열 치환
		
		System.out.println(sb);
		
		sb.setLength(10);
		System.out.println(sb);
		
		String x = new StringBuffer("This").append(" is").append(" pencil").insert(8, "my").replace(8, 10, "your ").toString();
		System.out.println(x);
		
		
		
	}

}
