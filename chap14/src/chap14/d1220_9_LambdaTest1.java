package chap14;

class MyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable 구현자식클래스 실행");
	}
}


public class d1220_9_LambdaTest1 {

	public static void main(String[] args) {
		
		MyThread mt = new MyThread();
		Thread t = new Thread(mt);
		t.start();
		
		
		//내부 클래스
		class MyInnerThread implements Runnable{

			@Override
			public void run() {
				System.out.println("Runnable 구현내부클래스 실행");
			}
		}
		
		Thread t2 = new Thread(new MyInnerThread());
		t2.start();
		
		//3. 무명클래스 - 정의 동시에 객체 생성
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runnable 구현익명클래스 실행");
			}
		}).start();
		
		
		//람다식 - 함수형인터페이스 (추상메소드 1개만)
		Runnable r4 = ()->{
				System.out.println("람다식 실행");
		};
		
		Thread t4 = new Thread(r4);
		t4.start();
	}
}