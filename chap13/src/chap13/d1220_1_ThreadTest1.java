package chap13;

class MyThread extends Thread{
	public void run() {
		for(int i = 1; i <= 50;i++) {
			System.out.print("mt"+"/");
		}
	}
}

class MyThread2 implements Runnable {
	public void run() {
		for(int i = 1; i <= 50; i++) {
			System.out.print("t2" + "/");
		}
	}
}

public class d1220_1_ThreadTest1 {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		MyThread2 mt2 = new MyThread2();
		Thread t2 = new Thread(mt2);
		
		mt.setPriority(10); // - //멀티쓰레드 할떄 우선순위 주기 위해서
		t2.setPriority(1); // |
		
		System.out.println("mt 우선순위 = " + mt.getPriority());
		System.out.println("t2 우선순위 = " + t2.getPriority());
		System.out.println("main 우선순위 = " + Thread.currentThread().getPriority());
		
		t2.start();
		mt.start();
		System.out.println("main종료");

	}
}