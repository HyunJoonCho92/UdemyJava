package constructor;

public class d1212_1_VarInitTest {
	
	int a = 10;
	double b = 10/9;
	String c = "생성초기화";
	
	d1212_1_VarInitTest(){

	}
	d1212_1_VarInitTest(int a, int b){
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		
		int d = 0;
		System.out.println(d); //지역변수는자동초기화 안됨.
		
		d1212_1_VarInitTest test = new d1212_1_VarInitTest();
		System.out.printf("a = %d, b = %f, c = %s\n", test.a, test.b, test.c);

	}

}
