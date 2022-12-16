package chap10;

import java.util.Calendar;
import java.util.Date;

public class d1216_4_DateTest {

	public static void main(String[] args) {
		
//		Date now = new Date();
//		System.out.println(now/*toString()*/);
//		System.out.println(now.getYear()); //deprecated 메소드
		//소스구현상 문제, 다른 메소드 충돌 여러가지 이후 사용 자제 권고
		
		//------------------------------------------------
		//Calendar - 추상클래스
		//구현 자식클래스들 제공 = "한국"
		//static 메소드 - Calendar 객체 생성 리턴 메소드
		//locale (os) 설정 맞는 시간 날짜 생성 클래스 객체 리턴
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
//		cal.set(2022, 11, 11); //년,월,일 지정
//		cal.set(Calendar.YEAR, 2024); // 년을 2024년으로 바꿈
//		cal.add(Calendar.MONTH, 1);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		System.out.printf("현재 년도 = %d, 월 = %d, 일 = %d, 시간 = %d, 분 = %d, 초 = %d\n", year, month, day, hour, minute, second);
	}
}