package chap8;

class Test2{
	void m1(int i) throws NumberFormatException{
		
		if(i <= 0) {
			throw new NumberFormatException("자연수만 가능합니다.(음수불가능)");
		}
		
		
		// i가 소스인지 판단
		// 소수 - 1과 자신수로만 나누어지는 자연수
		// 1-자신수 나머지 0 경우 2개 -- 소수
		int count = 0;
		for(int index = 1; index <= i; index++) {
			if(i % index == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(i + "소수이다.");
		}
		else {
			System.out.println(i + "소수 아니다.");
		}
	}
}

public class d1215_2_ThrowTest {

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		
		try {	
			t2.m1(-13);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		try {	
			t2.m1(13);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
