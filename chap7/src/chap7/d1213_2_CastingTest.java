package chap7;

class Parent{
	int su = 10;
	void print() {
		System.out.println(su);
	}
	
	void mp() {
		System.out.println("parent 클래스");
	}
}

class Child1 extends Parent{
	int su = 20;
	void print() {
		System.out.println(su);
	}
	
	void mc() {
		System.out.println("child1 클래스");
	}
}

class Child2 extends Parent{
	int su = 30;
	void print() {
		System.out.println(super.su + su);
	}
	void mc2() {
		System.out.println("child2 클래스");
	}
}

public class d1213_2_CastingTest {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		System.out.println(p1.su);
		p1.print();
		p1.mp();
		//p1.mc(); //안됨
		
		Child1 c1 = new Child1();
		System.out.println(c1.su);
		c1.print();
		c1.mp();
		c1.mc();
		
		Parent p2 = new Child1(); //자동형변환 발생
		System.out.println(p2.su);
		p2.print();
		p2.mp();
		//p2.mc(); //안됨
		
		if(p2 instanceof Child1) { //형변환가능
			((Child1)p2).mc();
		}
		else {
			System.out.println("p2 Child1 타입 형변환 불가");
		}
		
		Parent p3 = new Child2(); //자동형변환 발생
		System.out.println(p3.su);
		p3.print();
		//p3.mc2(); //안됨.
		if(p3 instanceof Child2) {
			((Child2)p3).mc2();
		}
		else {
			System.out.println("p3 Child2 타입 형변환 불가");
		}

	}
}