package chap7;
//자바 자동 포함 - 생성자, 상속
//java.lang.Object 클래스 라이브러리가 있다.
//java.lang.Object 클래스 변수나 메소드 자바 모든 클래스 자동포함 사용가능

class Employee{ //사원
	/*private*/ String title = "사원";
	int id;
	String name;
	String dept;
	double salary;
	
	void calcSalary(int salary) {
		this.salary = salary * 2;
	}
	
	void printAll() {
		System.out.printf("사번 = %d 이름 = %s 부서명 = %s 급여 = %f\n", this.id, this.name, this.dept, this.salary);
	}
}

class Manager extends Employee{//관리직 사원
	String title = "관리직";
	String job;
	
	Manager(int id, String name, String dept, String job){
		super.id = id;
		super.name = name;
		super.dept = dept;
		this.job = job;
	}
	
	
	//title 어떻게 나오는지 확인하기
	void test() {
		String title = "test메소드내부";
		System.out.println(title);
		System.out.println(this.title);
		System.out.println(super.title);
	}
	
	//calcSalary, printAll 메소드 Employee 정의한 대로
	//상속받아 사용
	//메소드 내용 수정 필요 - 
	//상속 후에 하위클래스에서 메소드 내용 재정의 - 메소드 overriding
	
	@Override  //'@' 자바컴파일러 알려주는 주석문
	void printAll() {
		super.printAll();
		System.out.printf("관리직종=%s\n" , job );
	}
}



//상속 2개 안된다!!!
//class C extends A, B{
//	int k = 30;
//}

public class d1212_2_ManagerTest {

	public static void main(String[] args) {
		
		Manager m = new Manager(100,"홍길동","영업부", "영업관리");
		m.calcSalary(50000); //상속
		m.printAll();
		
//		System.out.printf("사번 = %d\n이름 = %s\n부서명 = %s\n관리직종 = %s \n", m.id, m.name, m.dept, m.job);
		
	}
}