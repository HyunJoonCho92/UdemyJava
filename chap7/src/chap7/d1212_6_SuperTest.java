package chap7;

class A{
	int i;
	A(){
		
	}
	A(String s){
		i = 10;
		System.out.println("A생성자 호출");
	}
}

class B extends A{
	int j;
	B(){
		super("test");
		j = 20;
		System.out.println("B생성자 호출");
	}
}

public class d1212_6_SuperTest {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);

	}
}
