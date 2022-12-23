package chap13;

import java.util.Scanner;

class TimeThread extends Thread{
	public void run() {
		for(int i = 1; i <= 300; i++) {
			System.out.print("|");
		}
		
		// 작업 소요 시간
		System.out.println("소요시간(1/1000초) = " + (System.currentTimeMillis() - d1220_2_ThreadTest2.startTime));
	}
}

public class d1220_2_ThreadTest2 {
	static long startTime = 0;

	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		tt.start();

		// 현재 시각. 1/1000초;
		startTime = System.currentTimeMillis();
		
		for(int i = 1; i <= 300; i++) {
			System.out.print("-");
		}
		System.out.println("소요시간(1/1000초) = " + (System.currentTimeMillis() - startTime));
		
		
		

	}

}
