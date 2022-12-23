package chap8;

import java.io.FileNotFoundException;
import java.io.FileReader;

class Test{
	void m1(int i) throws ArithmeticException, FileNotFoundException {
		
		System.out.println(10 / i);
		//ArithmeticException - 반드시 처리구문 존재 x
		FileReader fr = new FileReader("none.txt");
		//FileNotFoundException - 반드시 처리구문
	}
	
	void m2() {
		try {
			m1(0);
		}catch(ArithmeticException e){
			try {
				m1(10);
			}catch( FileNotFoundException e2) {
				System.out.println("파일명이나 경로명을 확인하세요.");
			}
		}catch(FileNotFoundException e) {
			System.out.println("파일명이나 경로명을 확인하세요.");
		}
	}
	
	void m3() throws FileNotFoundException{
		m1(10);
	}
	

}

public class d1215_1_ThrowsTest {

	public static void main(String[] args) throws FileNotFoundException{
		Test t = new Test();
//		try {
//			t.m2();
//		}catch(FileNotFoundException e) {
//			System.out.println("main에서 받아서 처리합니다.");
//		}
		
		
		t.m2();
		
		try {
			t.m3();
		}catch( FileNotFoundException e2) {
			System.out.println("파일명이나 경로명을 확인하세요.");
		}
	}
}