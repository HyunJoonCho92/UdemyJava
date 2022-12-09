package chap6;

class A{
	int i;
	public void test() {
		int j = 20;
		System.out.println(i + j);
	}
	
	public void test2() {
		System.out.println(i);
	}
}

public class d1209_4_MemberLocalTest {

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.i = 10;
		System.out.println(a1.i);
		a1.test();
		// a1.j = 200; // 이건 클래스 내부 변수가 아니기 때문에 안된다.


	}

}
