package chap10;

import java.util.Calendar;

public class d1216_5_CalendarTest3 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //현재시각
		
		cal.set(Calendar.YEAR, 2024); //2024년 세팅. 2024년 12월 16일
		cal.add(Calendar.MONTH, 1); // 달 +1. 2025년 1월 16일
		
		System.out.println(cal);
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int date = cal.get(Calendar.DAY_OF_WEEK);//1~7
		final String weekdays[] = {"", "일", "월","화","수","목","금","토"};
		
		System.out.printf
		("현재 년도 = %d, 월 = %d, 일 = %d, 시간 = %d, 분 = %d, 초 = %d, %s요일\n",
				 year, month, day, hour, minute, second, weekdays[date]);

		

	}

}
