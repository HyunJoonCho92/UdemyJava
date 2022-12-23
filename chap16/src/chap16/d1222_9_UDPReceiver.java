package chap16;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class d1222_9_UDPReceiver {

	public static void main(String[] args) throws Exception{
		
		DatagramSocket ds = new DatagramSocket(15000); //랜덤 포트
		System.out.println("[수신자 : 수신 시작]");
		
//		String data = " 오늘 오후 5시반에 종료합니다. ";
//		byte by[] = data.getBytes();
//		DatagramPacket dp = new DatagramPacket(by, by.length, new InetSocketAddress("127.0.0.1", 15000));
//		ds.send(dp);
//		System.out.println("발신자 : 발신 처리]");
		
		byte b[] = new byte[1000]; //수신받은 내용 저장 배열
		DatagramPacket dp = new DatagramPacket(b, b.length);
		ds.receive(dp);
		String s = new String(b);
		System.out.println(dp.getAddress() + " 주소의 " +
				dp.getPort() + " 포트에서 " + s.trim() + "를 받았습니다.");
		System.out.println("[수신자 : 수신 종료]");
		
		
		// 응답 send
		String time = new SimpleDateFormat("HH시 mm분 ss초").format(new Date());
		DatagramPacket timedp = new DatagramPacket
				(time.getBytes(), time.getBytes().length, new InetSocketAddress(dp.getAddress(), dp.getPort()));
		ds.send(timedp);
		
		ds.close();
		
	}
}