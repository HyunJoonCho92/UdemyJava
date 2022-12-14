package chap8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class d1214_9_CheckedTest {

	public static void main(String[] args) {
		//sample.txt 입력용 사용 오픈 허락
		//java.io.FileNotFoundexception 발생 - 컴파일러 경고 예외
		//예외처리 반드시 try-catch
		//checkedexception 종류
		//class FileNotFoundException extends Exception
		try {
			FileReader fr = new FileReader("sample.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//ArithmeticException발생-컴파일러 경고안한다 예외-실행
		//uncheckedexception종류
		//class RuntimeException extends Exception
		//class ArithmeticException extends RuntimeException
		System.out.println(10/0);
	}

}
