package chap6;

class D{
	int add(int i, int j){
		return i + j;
	}
	String add(String i, String j) {
		return i + j;
	}
	double add(double i, double j) {
		return i + j;
	}
}

public class d1209_8_OverloadTest {

	public static void main(String[] args) {
		
		D d = new D();
		
		int num = d.add(10, 20);
		String str = d.add("hyun", "joon");
		double du = d.add(3.14, 1.714);
		
		System.out.println(num + " " + str + " " + du);
		

	}
}
