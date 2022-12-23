package chap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class d1221_6_SystemInTest {

	public static void main(String[] args) throws IOException{
		
		System.out.println("키보드 입력을 대입니다.");
		
		/*while(true) {
			int data = System.in.read();
			if(data == 'q') break;
			System.out.println((char)data);
		}*/
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
/*		while(true) {
			int data = isr.read();
			if(data == 'q') break;
			System.out.println((char)data);
    	}
*/
/*		while(true) {
			String data = br.readLine();
			if(data.equals("q")) break;
			System.out.println(data);
    	}
    	// 1 2 
*/
		
		Scanner key = new Scanner(System.in);
	/*	while(key.hasNextInt()) {
			int first = key.nextInt();
			int second = key.nextInt();
			System.out.println(first + second);
		}
		while(key.hasNext()) {//공백이전 문자열
			String first = key.next();
			String second = key.next();
			System.out.println(first + second);
		}*/
		//"자바 프로그램 진행중"
		String first = key.nextLine();
		System.out.println(first);



	}

}
