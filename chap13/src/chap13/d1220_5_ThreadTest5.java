package chap13;

class JoinThread extends Thread{
	int i = 1;
	
	public void run() {
		i = 10;
		System.out.println("run메소드 내부 = " + i);
	}
}

public class d1220_5_ThreadTest5 {

	public static void main(String[] args) {
		
		JoinThread t = new JoinThread();
		//run 수행
		t.start(); //t : 실행가능상태    main:실행상태
		try {
			t.join();// t : 실행상태     main:일시중단상태  .join 다른 쓰레드의 작업을 기다린다.
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드 내부 = " + t.i);
		System.out.println("main 종료");
		

	}
}