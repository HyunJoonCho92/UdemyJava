package chap16;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class d1222_5_TCPClientTest {

	public static void main(String[] args) throws Exception {
		
		Socket s = new Socket("localhost", 10000);
		String serverip = s.getInetAddress().getHostAddress();
		System.out.println("== 클라이언트가 " + serverip + " 서버로 접속했습니다. ==");
		
		//클라이언트가 1번게시물 주세요 요청 = 출력스트림
		OutputStream os = s.getOutputStream();
		String request = "1번게시물\n"; //\n 은 종료 키워드로 사용!
		byte[] by = request.getBytes();
		os.write(by);
		//////////////////////////////
		
		///////////////////////////////////////////////////////
		//클라이언트의 요청을 전달받는다. = 입력스트림
		InputStream is = s.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String response = br.readLine();
        System.out.printf("==클라이언트가 서버로부터 '%s'요청을 전달받았습니다.==\n",response);
		//////////////////////////////////////////
		
		
		s.close();
		System.out.println("== 클라이언트가 서버의 접속 해제했습니다. ==");
		
	}

}
