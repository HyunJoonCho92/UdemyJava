package constructor;
// 자바 클래스명 = 자바파일명 기본


class Employee{
	int id;
	String name;
	String title;
	String dept;
	double salary;
	
	Employee(int id,String name, String title, String dept, double salary){
		System.out.println("Employee 생성자호출2");
		this.id = id;
		this.name = name;
		this.title = title;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	
	Employee(int id, String name){
		this(id, name, "직급미정", "배치이전", -1);
		System.out.println("Employee 생성자호출1");
		this.id = id;
//		this.name = name;
//		this.title = "직급미정";
//		this.dept = "배치이전";
//		this.salary = -1;
	}
	
	Employee(){
		System.out.println("Employee 생성자호출");
	}
	
	
	void printInform() {
		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다. \n",
				this.id, this.name, this.title, this.dept, this.salary);
	}
}


public class d1209_1_EmployeeTest {
	
	// 자바 어플리케이션 클래스 - "대장" - main
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id = 100;
		e1.name = "이사원";
		e1.title = "사원";
		e1.dept = "it개발부";
		e1.salary = 10000.0;
		e1.printInform();
		
		Employee e2 = new Employee(200, "박대리", "대리", "인재개발부", 15000.0);
		e2.printInform();
	}
}
