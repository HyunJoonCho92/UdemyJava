package chap7;

//import java.lang.*; //Math 변수와 메소드 사용 허락

import static java.lang.Math.*; // Math static 변수와 메소드 사용 허락
import static java.lang.Integer.*;

public class d1213_1_StaticImportTest {

	public static void main(String[] args) {
		
		//random 둘이 같은 표현
		//Math.random();
		java.lang.Math.random();
		
		int ran = (int)(Math.random() * 99) + 1; // 1~100 난수 생성
		
		System.out.println(ran);
		
	}
}