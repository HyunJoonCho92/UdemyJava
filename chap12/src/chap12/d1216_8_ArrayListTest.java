package chap12;

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
		// 여러가지 타입 저장 / 동일 타입 데이터만 저장강제적 규칙./ 동적 크기
		// Employee 타입 ArrayList
		// ArrayList Employee 타입 매개변수 유사 전달
		// ArrayList 저장 타입 제한
		// generics
		// 1. 컴파일 타입 체크 2. 형변환 코드 사라진다
		// add(Employee o) / Employee <-- get()
		ArrayList<Employee> list = new ArrayList(5);
//		list.add("java"); // <employee> 형이 아니라 불가
//		list.add(10);
//		list.add(3.14);
		Employee e1 = new Employee(100, "이사원", 1000000);
		Employee e2 = new Employee(200, "최대리", 1500000);
		Employee e3 = new Employee(300, "김부장", 2000000);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번째 위치 = " + list.get(i).name);
		}

	}

}
