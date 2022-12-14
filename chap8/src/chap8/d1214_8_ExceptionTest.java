package chap8;

public class d1214_8_ExceptionTest {
	
	public static void main(String[] args) {
		// 2개 이상 명령행매개변수 입력, 정수 변경가능한 값, 0은 아닌값 입력
		// 100 100 - 정상
		// 100 - ArrayIndexOutOfBoundsException - 중단
		// 100 0 - ArithmeticException - 중단
		// 백 백 - NumberFormatException - 중단
		
		int k = 0;
		
		try {
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			k = i / j;
		}catch(ArithmeticException e) {
			System.out.println("0을 입력하실 수 없습니다.");
		}finally {
			System.out.println("항상 출력됩니다.");
		}
		
		
//		catch(ArithmeticException e) {
//			System.out.println("0을 입력하실 수 없습니다.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("숫자 2개 입력해주세요");
//		}catch(NumberFormatException e) {
//			System.out.println("정수로 변경 가능한 값을 입력하셔야 합니다.");
//		}
		
		
		System.out.println("나누기 결과 = " + k);
		System.out.println("main 종료");

	}
}