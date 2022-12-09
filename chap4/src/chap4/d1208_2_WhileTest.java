package chap4;

public class d1208_2_WhileTest {

	public static void main(String[] args) {
		
//		for(int i = 0 ; i < 10; i++) {
//			int test = (int) (Math.random() * 100) + 1;
//			System.out.println(test);
//		}
		
		int i = 0;
		while(i < 10) {
			int test = (int) (Math.random() * 100) + 1;
			System.out.println(test);
			i++;
		}

	}

}
