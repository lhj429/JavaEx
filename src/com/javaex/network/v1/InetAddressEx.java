package com.javaex.network.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {

		try {
			// 내 IP 주소 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("IP Address:" + local.getHostAddress()); // 내부 네트워크(외부에서 접속 불가)

			// www.google.com의 서버 IP 받아오기
			String hostName = "www.naver.com";
			
			InetAddress[] adrs = InetAddress.getAllByName(hostName);
			for(InetAddress remote : adrs) {
				System.out.println(hostName + " IP Address:" + remote.getHostAddress());
			}

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
