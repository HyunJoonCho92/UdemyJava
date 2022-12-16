package chap7;
	
interface I1{
	void m1();
}

interface I2{
	void m2();
}

public class d1214_7_AnonymousTest {

	public static void main(String[] args) {
		//Ano a = new Ano();
		
		//I1 인터페이스 상속 무명 클래스 정의 + 객체 생성 문장 
		I1 i1 = new I1() {
			public void m1() {
				System.out.println("m1 호출");
			}
		};
		i1.m1();
		
		I2 i2 = new I2() {
			public void m2() {
				System.out.println("m2 호출");
			}
		};
		i2.m2();
	}
}