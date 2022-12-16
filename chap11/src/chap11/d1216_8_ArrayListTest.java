package chap11;

import java.util.ArrayList;

class Employee{
	//toString , equals -상속 그대로.
	//패키지명.클래스명@16진수주소값
	int id;
	String name;
	double pay;
	
	public Employee(int id, String name, double pay) {
		//super();
		this.id = id;
		this.name = name;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return (id + "-" + name + "-" + pay);
	}	
}

public class d1216_8_ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList(5);
		list.add("java");
		list.add(10);
		list.add(3.14);
		Employee e1 = new Employee(100, "이사원", 1000000);
		Employee e2 = new Employee(200, "최대리", 1500000);
		Employee e3 = new Employee(300, "김부장", 2000000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getClass().getName() + ":");
			System.out.println(list.get(i)); // id-name-pay 형식 출력
		}

	}

}
