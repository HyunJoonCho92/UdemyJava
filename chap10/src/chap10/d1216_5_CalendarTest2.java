package chap10;

import java.util.Calendar;

public class d1216_5_CalendarTest2 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); //현재 날짜 시각
		
		Calendar end = Calendar.getInstance();
		end.set(2023, 2, 3); //2023년도 3월 3일
		
		// 1/1000초 단위
		long nowmil = now.getTimeInMillis();
		long endmil = end.getTimeInMillis();
		
		System.out.println(Math.abs(nowmil - endmil) + "(1/1000)초 단위");
		System.out.println((Math.abs(nowmil - endmil)) / 1000 + "초 단위");
		System.out.println( Math.abs((nowmil - endmil)/1000/(60*60*24)) + "일단위");
		//일단위
		// 초
		// 1분 - 60초
		// 1시간 60*60
		// 1dlf - 24시간
		
	}

}
