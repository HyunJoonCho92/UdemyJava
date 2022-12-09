package chap6;
// 자바 클래스명 = 자바파일명 기본


class Employee{
	int id;
	String name;
	String title;
	String dept;
	double salary;
	
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
		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다. \n",
				e1.id, e1.name, e1.title, e1.dept, e1.salary);
		
		Employee e2 = new Employee();
		e2.id = 200;
		e2.name = "박대리";
		e2.title = "대리";
		e2.dept = "인재개발부";
		e2.salary = 15000.0;

		e2.printInform();
		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다. ",
				e2.id, e2.name, e2.title, e2.dept, e2.salary);
		
		
		// 배열로 Employee객체 10개 만들기
		Employee arr[] = new Employee[10];

	}
}
