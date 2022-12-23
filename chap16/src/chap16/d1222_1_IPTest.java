package chap16;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class d1222_1_IPTest {

	public static void main(String[] args) {
		
		//windows ipconfig
		try {
			InetAddress[] iparr = InetAddress.getAllByName("www.naver.com");
			
			for(InetAddress ip : iparr) {
				System.out.println(ip.getHostAddress());
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		//내컴퓨터
		try {
			InetAddress ip = InetAddress.getLocalHost(); // 내 로컬호스트
			
			System.out.println(ip.getHostAddress());
			System.out.println(ip.getHostName());
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
