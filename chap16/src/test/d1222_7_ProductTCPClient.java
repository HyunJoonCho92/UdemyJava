package test;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class d1222_7_ProductTCPClient {

	public static void main(String[] args)  throws Exception{
		
		System.out.println("상품 정보를 입력하세요");
		
		Scanner key = new Scanner(System.in);
		System.out.println("상품명 : ");
		String name = key.next(); //공백 엔더 구분자??
		System.out.println("가격 : ");
		String price = key.next();
		System.out.println("수량 : ");
		String balance = key.next();
		
		Socket s = new Socket("127.0.0.1", 10000);
		
		String serverip = s.getInetAddress().getHostAddress();
		
		System.out.println("==클라이언트가 " + serverip + " 서버로 접속했습니다. ==");
		OutputStream os = s.getOutputStream();
		
		 name = name + " ";
		 price = price + " ";
		 balance = balance + " ";
		 
//		 String request = name + "-" + price + "-" + balance;
//		 byte[] by = request.getBytes();
//		 os.write(by);
		 
		 os.write(name.getBytes());
		 os.write(price.getBytes());
		 os.write(balance.getBytes());
		 
		/////////////////////////////////////////////////////////////////////////
		//서버로부터 응답 = 입력스트림
		InputStream is = s.getInputStream();
		//BufferedReader br = new BufferedReader(new InputStreamReader(is));
		//String request = br.readLine();
		
		Scanner sc = new Scanner(is);
		String response = sc.nextLine();
		System.out.println("[클라이언트가 서버로부터 " + response + " 응답을 전달받았습니다.]");
		/////////////////////////////////////////////////////////////////////////
				
		s.close();
		System.out.println("==클라이언트가 서버의 접속 해제했습니다. ==");
		 

	}
}