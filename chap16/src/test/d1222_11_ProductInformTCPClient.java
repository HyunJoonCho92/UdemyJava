package test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class d1222_11_ProductInformTCPClient {

	public static void main(String[] args) throws Exception {
//		client- ProductInformTCPClient
//		1. 키보드 입력
//		조회할 상품명 입력하세요
//		상품명:
//		2. 서버로 전송
//		5. 서버로부터 받은 응답 출력
		
		System.out.println("조회할 상품명 입력하세요.\n상품명: ");
		
		Scanner sc = new Scanner(System.in);
		String product = sc.next();
		
		//서버로 접속
		Socket s = new Socket("127.0.0.1", 11000);
		String serverIp = s.getInetAddress().getHostAddress();
		System.out.println("==클라이언트가 \" + serverip + \" 서버로 접속했습니다. ==");
		
		//서버로 전송
		OutputStream os = s.getOutputStream();
		product = product + " ";
		os.write(product.getBytes());
		
		/////////////////////////////////////////////////////////////////////////
		//서버로부터 응답 = 입력스트림
		InputStream is = s.getInputStream();
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//String request = br.readLine();
		
		Scanner sc2 = new Scanner(is);
		String response = sc2.nextLine();
		System.out.println("[클라이언트가 서버로부터 " + response + " 응답을 전달받았습니다.]");
		/////////////////////////////////////////////////////////////////////////
		
		s.close();
		System.out.println("==클라이언트가 서버의 접속 해제했습니다. ==");

	}
}