package com.javaex.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {

	static String dirName = "D:\\javastudy\\files\\";
	
	public static void main(String[] args) {

		//파일 객체 
		File root = new File(dirName);

		//파일이 실제 존재하는지 확인
		System.out.println(dirName + ":" + root.exists());
		
		//파일 정보 출력
		printInfo(root);
		
		//디렉토리 안쪽에 파일 만들기
		File file = new File(dirName + "myfile.txt"); //메모리 상 파일 객체를 형성했으므로 실체는 없음
		
		if(!file.exists()) { //파일이 없으면 생성
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("파일을 만들지 못했어요.");
			}
		}
		
		printInfo(root);
		
		//파일 지우기
		file.delete();
		printInfo(root);
		
	}
	
	static void printInfo(File f) {
		System.out.println("---------------");
		
		//이 파일 객체가 디렉토리인지 확인
		if(f.isDirectory()) { //디렉토리
			System.out.println("Directory: " + f.getName());
			File[] files = f.listFiles(); 
			for(File file : files) { //파일 리스트 출력
				System.out.print(file.isDirectory()? "d " : "f ");
				System.out.println(file.getName());
			}
			
		} else { //디렉토리X(파일)
			System.out.println("File: " + f.getName());
		}
		
		System.out.println("---------------");
	}

}
