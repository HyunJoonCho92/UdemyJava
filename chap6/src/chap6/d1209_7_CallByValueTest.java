package chap6;

class Data{
	int k = 10;
}

class C{
	void add(int i) {
		System.out.println(i++);
	}
	
	void addData(Data d) {
		System.out.println(d.k++);
	}
}

public class d1209_7_CallByValueTest {

	public static void main(String[] args) {
		C c1 = new C();
		int j = 10;
		c1.add(j);
		
		System.out.println("main에서 add 종료 후 j = " + j);

		
		Data main_d = new Data();
		c1.addData(main_d);
		System.out.println("main에서 addData 종료 후 main_d.k = " + main_d.k);
	}

}
