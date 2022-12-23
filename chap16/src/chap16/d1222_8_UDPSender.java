package chap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class d1222_8_UDPSender {

	public static void main(String[] args) throws Exception{
		
		DatagramSocket ds = new DatagramSocket(); //랜덤 포트
		System.out.println("[발신자 : 발신 시작]");
		
		String data = "지금 몇시예요?";
		
		byte by[] = data.getBytes();
		
		DatagramPacket dp = new DatagramPacket(by, by.length, new InetSocketAddress("127.0.0.1", 15000));
		ds.send(dp);
		System.out.println("발신자 : 발신 처리]");
		System.out.println("[발신자 : 발신 종료]");
		
		//응답 받기
		byte b[] = new byte[1000]; //수신받은 내용 저장 배열
		DatagramPacket receivedp = new DatagramPacket(b, b.length);
		ds.receive(receivedp);
		String s = new String(b);
		
		System.out.println(dp.getAddress() + " 주소의 " +
				dp.getPort() + " 포트에서 " + s.trim() + "를 받았습니다.");
		
		ds.close();
	}
}