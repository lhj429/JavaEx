package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteArrayStreamEx {

	public static void main(String[] args) {

		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; //input source
		byte[] outSrc = null; //output target
		
		System.out.println(Arrays.toString(inSrc)); //input source check
		
		try {
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
			int data = 0;

			while(data!=-1) {
				data = bis.read();
				System.out.println("Read Data:" + data);
				bos.write(data);
			}
			
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println(Arrays.toString(outSrc));
			
			bos.close();
			bis.close();
			
		} catch(IOException e) {
			//IO 예외는 이곳에서 처리
		} catch(Exception e) {
			//위에서 처리되지 않은 예외는 이곳에서 처리
		}
		
		
		
	}

}
