package chap8;

public class d1214_10_ClassInformationTest {

	public static void main(String[] args) {
		// java.lang.Object - 존재합니다.
		// chap8.A - 존재하지 않습니다.
		// chap8.ChecktedTest - 존재합니다.
		
		/* Class.forName("클래스명") */
		
		try {
			Class.forName(args[0]);
			System.out.println(args[0] + " - 존재합니다.");
		}catch(ClassNotFoundException e) {
			System.out.println(args[0] + " - 존재하지 않습니다.");
		}
		
//		class Class{
//			forName(String name) throws ClassNotFoundException{
//			//name 문자열 클래스 존재하면 클래서 메모리 로드
//		}
		
		
	}
}