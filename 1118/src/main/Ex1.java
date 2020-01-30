package main;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex1 {
	public static void main(String[]args)throws UnknownHostException {
		InetAddress ip=InetAddress.getByName("www.naver.com");
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		
		InetAddress ip2=InetAddress.getLocalHost();
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		
		InetAddress[]ip3=InetAddress.getAllByName("www.naver.com");
		for(InetAddress e: ip3)
			System.out.println(e);
				
				
		
	}
}


