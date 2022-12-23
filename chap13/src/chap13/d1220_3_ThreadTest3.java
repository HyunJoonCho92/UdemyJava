package chap13;

import javax.swing.JOptionPane;

class NumberThread extends Thread{
	public void run() {
		//1초마다 1 - 10 숫자들 입력
		for(int i = 1 ; i <= 10; i++) {
			System.out.println(i); // 출력
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class d1220_3_ThreadTest3 {

	public static void main(String[] args) {
		
		NumberThread nt = new NumberThread();
		nt. start();

		
		 //사용자 문자열 입력
		String input = JOptionPane.showInputDialog("값 입력해 보세요.");
		System.out.println("입력값 = " + input);
	}
}