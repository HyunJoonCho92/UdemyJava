package chap15;

import java.io.BufferedReader;
import java.io.FileReader;

public class d1221_5_BufferedInTest2 {

	public static void main(String[] args) throws Exception{
		
		long start = 0;
		long end = 0;
		
		// 1. 파일로부터 직접 입력 소요 시간
		FileReader fis = new FileReader("C:/Users/user/Desktop/day10.pdf");
		start = System.currentTimeMillis();
		while(true) {
			int data = fis.read();
			if(data == -1) {
				break;
			}
		}
		
		end = System.currentTimeMillis();
		System.out.println("버퍼 비사용시 소요시간 = " + (end - start) + "ms");
		
		// ------------------------------------------------------------
		// 2. 버퍼 저장 입력 소요 시간
		fis = new FileReader("C:/Users/user/Desktop/day10.pdf");
		BufferedReader br = new BufferedReader(fis, 10);
		
		start = System.currentTimeMillis();
		while(true) {
			int data = br.read();
			if(data == -1) {
				break;
			}
		}
		end = System.currentTimeMillis();
		System.out.println("버퍼 비사용시 소요시간 = " + (end - start) + "ms");
		br.close();
	}
}