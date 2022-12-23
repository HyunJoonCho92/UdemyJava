package chap13;

class Buffer {
	int value;
	boolean available = false; // true 이면 value 읽기 가능 상태
							   // false 이면 value 저장 가능 상태
	/* synchronized */ int getValue() {
		while(this.available == false) {
//			try {
//				wait(); //쓰레드 일시중지 -> notify()로 풀 수 있음.그래서 setValue함수에 notify있음.
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		System.out.println("조회 : " + this.value);
		this.available = false;
//		notify();
		return this.value;
	}
	
	/* synchronized */ void setValue(int value) {
		while(this.available == true) {
//			try {
//				wait();
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		this.value = value;
		this.available = true;
		System.out.println("저장 : " + this.value);
//		notify();
	}
}

class Producer extends Thread{
	Buffer buf;
	
	Producer(Buffer buf){
		this.buf = buf;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			buf.setValue(i);
		}
	}
}

class Consumer extends Thread{
	Buffer buf;
	Consumer(Buffer buf){
		this.buf = buf;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			buf.getValue();
		}
	}
}

public class d1220_7_ThreadTest7 {

	public static void main(String[] args) {
		
	Buffer buf = new Buffer();
	Producer p = new Producer(buf);
	Consumer c = new Consumer(buf);
	
	p.start(); //저장
	c.start(); //조회

	}
}