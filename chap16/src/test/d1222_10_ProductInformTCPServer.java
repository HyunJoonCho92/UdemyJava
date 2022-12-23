package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class d1222_10_ProductInformTCPServer {
	

	public static void main(String[] args) throws Exception {
		
//		server - ProductInformTCPServer
//		3. product.txt 
//		name - price - balance
//		4. 클라이언트 상품명 동일한 것 - 가격 수량
//		클라이언트로 전송
		
		ArrayList<String> products = new ArrayList<>();
		
		ServerSocket ss = new ServerSocket(11000);
		System.out.println("서버 11000 포트 대기중");

		Socket s = ss.accept();
		String clientIp = s.getInetAddress().getHostAddress();
		System.out.println("서버는 "+ clientIp + " 클라 접속 중");
		
		// 파일 읽어오기
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		String str = null;
		while((str = br.readLine()) != null) {
			products.add(str);
		}
		
		//클라이언트로 값 받기
		InputStream is = s.getInputStream();
		Scanner sc = new Scanner(is);
		String product = sc.next();
		
		//받은 값과 비교
		boolean flag =false;
		String response = null;
		
		for(String i : products) {
			if(product.equals(i.split(" ")[0])) {
				response = i;
				flag = true;
			}
		}
		
		if(!flag) {
			response = "상품 없음";
		}
		
		//클라이언트로 값 보내기
		OutputStream os = s.getOutputStream();
		byte[] by = response.getBytes();
		os.write(by);
		
		s.close();
		System.out.println("클라이언트 접속 종료");
		br.close();
		ss.close();
		
			
			
			



	}
}