package chap5;

public class d1208_5_StudentTest {

	public static void main(String[] args) {
		
		if(args.length < 5) {
			System.out.println("최소 5명의 이름을 입력하셔야합니다.");
			return;
		}
		
		String names[] = new String[5];
		for(int i = 0 ; i < names.length; i++) {
			names[i] = args[i] + " 응시자";
		}
		
		int kor[] = new int[names.length];
		for(int i = 0 ; i < kor.length; i++) {
			kor[i] = (int)(Math.random() * 100) + 1;
		}
		int eng[] = {96, 100, 66, 89, 49};
		
		// 1. 입력변수 이름이 홍길동 응시자의 국어, 영어 점수, 합계 출력
		// 2. 정수평균은 국어 60%, 영어 40% 비율로 계산
		
		// 1.
		for(int i =0; i < names.length; i++) {
			if(names[i].equals("홍길동 응시자")) {
				System.out.println(names[i] + "의 국어, 영어 점수, 합계");
				System.out.println("국어 : " + kor[i]);
				System.out.println("영어 : " + eng[i]);
				System.out.println("합계 : " + (kor[i] + eng[i]));
				System.out.println("정수평균(국어60%+영어40%) : " + ((kor[i]*0.6) + (eng[i]*0.4)));
			}
		}
		
	}

}
