package chap2;

public class d1207_3_VariableTest {
	
	public static void main(String[] args) {
		byte score = 100;
		System.out.println(score);
		
		//score = score + 100;
		//오류 이유) byte범위를 넘어서서
		
		int score1 = 62;
		int score2 = 95;
		int score3 = 60;
		
		//정수 산술연산자 정수 ==> 정수
		//실수 산술연산자 정수 ==> 실수
		//실수 산술연산자 실수 ==> 실수
		
		//정수 평균
		int average = (score2 + score3) / 2;
		System.out.println("정수평균" + average);
				
		//실수 평균
		double avgDouble = (score1 + score2 + score3) / 3;
		System.out.println("실수평균" + avgDouble);
		//반올림
		long num = Math.round(avgDouble);
		System.out.println("반올림" + num);
		
		//원의 넓이
		int radius = 5;
		final double pi = 3.14; //상수 PI
		double area = radius * radius * pi;
		
		radius = 10;
		area = radius * radius * pi;
		
		
		//
		int i = 10;
		String s = "java";
		double d = 3.14;
		
		// printf 표현
		System.out.printf("%d를 표현합니다.\n", 10);
		System.out.printf("%f를 표현합니다.\n", 10.99);
		System.out.printf("%s를 표현합니다.\n", "홍길동");
		System.out.printf("%c를 표현합니다.\n", '웅');
		
		String loc = "새싹 용산캠퍼스";
		String title = "클라우드 기반 웹서버 과정";
		int week = 3;
		System.out.printf("우리는 %s에서 %s을 수강합니다.\n 현재 %d주째 시작합니다.\n", loc, title, week);
		
		
		//정수형의 오버플로우
		byte b = 127;
		//b = b + 1; //컴파일 오류. 오버플로우
		int ii = b + 1; //가능. int로 바뀜
		byte b2 = (byte)(b + 1);
		System.out.println("int데이터=" + ii + ", byte데이터=" + b2);
		
		
	}
}
