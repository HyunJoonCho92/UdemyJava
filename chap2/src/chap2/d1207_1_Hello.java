package chap2;
//소스파일(수동) - 컴파일(자동) - 실행(수동)
//java
public class d1207_1_Hello {
	
	public static void main(String[] args) {
		System.out.println("hello 자바"); //sysout ctr+spacebar
		//System.out.print("두번째 줄 입니다.");
		//System.out.println("두번째 줄 뒤에 붙입니다.");
		System.out.println("한줄입니다." + "-- 한줄 뒤에 붙입니다.");
		System.out.println("세번째줄입니다." + (100 + 200));
		// + 연산자 출력 "자주" 사용
		// + 연산자 기능 2가지
		// 1. 문자열 + 문자열 또는 문자열 + 다른 타입 ===> 문자열 결합
		// 2. 정수, 실수 + 정수, 실수 ==> 덧셈
		// 3. 왼쪽부터 연산
		// 4. 우선순위 ()
	}
}
