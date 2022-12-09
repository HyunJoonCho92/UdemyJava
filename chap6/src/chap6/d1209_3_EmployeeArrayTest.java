package chap6;

public class d1209_3_EmployeeArrayTest {

	public static void main(String[] args) {
		
		Employee arr[] = new Employee[2];
		
		Employee e1 = new Employee();
		e1.id = 100;
		e1.name = "이사원";
		e1.title = "사원";
		e1.dept = "it개발부";
		e1.salary = 10000.0;
		arr[0] = e1;
		
		Employee e2 = new Employee();
		e2.id = 200;
		e2.name = "박대리";
		e2.title = "대리";
		e2.dept = "인재개발부";
		e2.salary = 15000.0;
		arr[1] = e2;
		
				
		for(int i = 0 ; i < arr.length;i++) {
			System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f 입니다. \n",	
					arr[i].id, arr[i].name, arr[i].title, arr[i].dept, arr[i].salary);
		}

	}
}
