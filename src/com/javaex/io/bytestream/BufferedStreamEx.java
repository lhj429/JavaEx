package com.javaex.io.bytestream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStreamEx {

	static String dirName = "D:\\javastudy\\files\\";
	static String source = dirName + "img.jpg";
	static String target = dirName + "img_buffered_copy.jpg";

	public static void main(String[] args) {

		// file stream 열기
		try {
			InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target);

			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			// int data = 0;
			byte[] data = new byte[10240];
			int size = 0;

			while ((size = bis.read(data)) != -1) {
				bos.write(data);
				System.out.println(size + " 바이트 복사했습니다.");
			}

			bis.close();
			bos.close();

			System.out.println("파일을 복사했습니다.");

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

	}

}
