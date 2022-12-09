package chap4;

public class d1207_6_ScoreTest {

	public static void main(String[] args) {
		String name = "홍길동";
		
		// 1 ~ 199 사이 난수 생성
		double d = Math.random() * 100; //0~10사이 난수만들기
		int kor = 100;
		int eng = 50;
		int mat = 75;
		int sum = kor + eng + mat; //총점
		double avg = sum / 3; //실수평균
		int avgInt = (int)avg; //정수평균
		String grade;
		
		if(avgInt >= 90 && avgInt <= 100) {
			grade = "A등급";
		}
		else if(avgInt >= 80 && avgInt < 90) {
			grade = "B등급";
		}
		else if(avgInt >= 70 && avgInt < 80) {
			grade = "C등급";
		}
		else if(avgInt >= 60 && avgInt < 70) {
			grade = "D등급";
		}
		else {
			grade = "낙제등급";
		}
//		조건문
//		avgInt 90이상 ~ 100 이하이면 grade "A등급"
//		avgInt 80이상 ~ 90 미만이면 grade "B등급"
//		avgInt 70이상 ~ 80 미만이면 grade "C등급"
//		avgInt 60이상 ~ 70 미만이면 grade "D등급"
//		avgInt 그 외 grade "낙제등급"
		
		
		
		System.out.printf("%s 학생은 국어 = %d점, 영어 = %d점, 수학 = %d 점입니다.\n"
				+ "총점은 %d이고 평균(실수평균)은 %f(%d)입니다. \n 등급은 %s입니다.\n"
				+ "", name, kor, eng, mat, sum, avg, avgInt, grade);

	}

}
