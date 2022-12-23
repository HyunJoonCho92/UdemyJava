package chap13;

import javax.swing.JOptionPane;

class NumThread extends Thread{
	
	NumThread(String name){
		super(name); //Thread(String) 생성자 호출 - 이름
	}
	
	public void run() {
		//1초마다 1~10 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class d1220_4_ThreadTest4 {

	public static void main(String[] args) {
		
		NumThread nt1 = new NumThread("nt1");
		NumThread nt2 = new NumThread("nt2");
		
		nt1.start();
		nt2.start();
	}
}