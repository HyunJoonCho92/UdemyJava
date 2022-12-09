package test;

public class d1207_9_Test3 {

	public static void main(String[] args) {
		//12명의 학생에게 xx권을 나누어주고 남은책은 몇권인가요???
		
		int books = 100; //도서수
		int cntOfStu = 12; //학생수
		
		int answer = books / cntOfStu;
		int leftover = books % cntOfStu;
		
		
		

		System.out.println("12명의 학생에게 "+ answer +"권을 나누어주고 남은책은 " + leftover +"권");
	}

}
