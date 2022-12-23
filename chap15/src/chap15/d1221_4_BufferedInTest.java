package chap15;

import java.io.BufferedReader;
import java.io.FileReader;

public class d1221_4_BufferedInTest {

	public static void main(String[] args) throws Exception{
		
		FileReader fis = new FileReader("src/chap15/d1221_1_FileViewer.java");
		BufferedReader br = new BufferedReader(fis, 10);
		
		while(true) {
//			int data = br.read(); //4byte 중 1byte만 활용. 파일 입력
//			if(data == -1)
//				break;
//			System.out.println((char)data); //파일 입력 내용을 모니터 출력
			
			String line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		
		br.close();
	}
}