package test;

public class d1207_8_Test2 {

	public static void main(String[] args) {
		//10000초는 xx시간 xx분 xx초 인가???
		
		int time = 10000;
		int temp = time;
		
		
		//1초는 1초
		//1분은 60초
		//1시간 == 60분 == 3600초
		int hour = temp / 3600;
		temp = temp - (3600 * hour);
		
		int minute = temp / 60;
		temp = temp - (60 * minute);
		
		int sec = temp;
		
		
		System.out.println("10000초는 " + hour + "시간 " + minute +"분 " + sec +"초");

	}

}
