package chap16;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class d1222_4_TCPServerTest {

	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(10000); //소캣 객체 생성
		System.out.println("[서버는 10000 포트에서 대기중입니다.]");
		
		while(true) {
			Socket s = ss.accept(); //소캣 생성 and Open
			String clientip = s.getInetAddress().getHostAddress();//Ip address 추출
			System.out.println("[서버는 " + clientip + " 클라이언트 접속 허용합니다.]");
			///////////////////////////////////////////////////////
		
			//클라이언트의 요청을 수락 = 입력스트림
            InputStream is = s.getInputStream();
            //방법 1번
            //BufferedReader br = new BufferedReader(new InputStreamReader(is));
            //String request = br.readLine();
            //방법 2번
            Scanner sc = new Scanner(is);
            String request = sc.nextLine();
            
            System.out.printf("[서버는 클라이언트로 부터 '%s'요청을 전달받았습니다.]\n",request);

			//////////////////////////////////////////
			//클라이언트의 요청 처리. 응답하기 - 출력스트림
			String response = "1번 제목1 내용1 작성자1\n";
			OutputStream os = s.getOutputStream();
			byte[] responseBytes = response.getBytes();
            os.write(responseBytes);
            System.out.printf("[서버는 클라이언트로 응답을 전달합니다.]\n");
			
            /////////////////////////////////////////////
			
            s.close();//연결해제
            System.out.println("[클라이언트의 접속을 해제합니다.]");
		}
	}

}
