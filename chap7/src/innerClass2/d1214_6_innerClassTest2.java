package innerClass2;

class Outer{
	static int i = 10;
	
	void mo() {
		System.out.println(i + new Inner().j);
	}
	
	static class Inner{
		static int j = 20;
		static void mi() {
			System.out.println(i - j);
		}
	}
}

public class d1214_6_innerClassTest2 {
	public static void main(String[] args) {
		//Outer o = new Outer();
		//Outer.Inner inner = o.new Inner();
		Outer.Inner.mi();
		//System.out.println(o.i);
		//System.out.println(inner.j);
	}
}
