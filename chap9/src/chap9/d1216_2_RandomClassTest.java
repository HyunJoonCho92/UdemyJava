package chap9;

import java.util.Random;

public class d1216_2_RandomClassTest {

	public static void main(String[] args) {
		
//		int mathran = (int)(Math.random() * 100) + 1;
//		System.out.println("Math.random() 정수 = " + mathran);
//		Random ran = new Random();
//		System.out.println("Random 정수 = " + ran.nextInt(100));
//		System.out.println("Random 실수 = " + ran.nextDouble(100.0));
		
		Random ran = new Random();
		for(int i = 1 ; i <= 5; i++) {
			System.out.println("Random 정수 = " + ran.nextInt(100));
		}
		
		System.out.println("===================");
		Random ran2 = new Random(2);
		for(int i = 1 ; i <= 5; i++) {
			System.out.println("Random 정수 = " + ran2.nextInt(100));
		}

	}

}
