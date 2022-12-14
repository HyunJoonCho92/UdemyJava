package innerclass;

class Outer{
	int i = 10;
	void mo() {
		System.out.println(i);//외부클래스 메소드는 내부클래스 요소 접근 불가
	}
	class Inner{
		int j = 20;
		void mi() {
			System.out.println(i - j); //내부클래스 메소드는 외부클래스 요소ㅓ 접근ㅇ 가능
		}
	}
}

public class d1214_5_InnerClassTest {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		
		System.out.println(o.i);
		System.out.println(inner.j);
	}
}