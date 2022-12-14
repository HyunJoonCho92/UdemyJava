package salary;

class Employee{
	int id;
	String name;
	int baseSalary;
	int generalFee;
	int totalSalary;

	Employee(){
		this.id = 0;
		this.name = "";
		this.baseSalary = 0;
		this.generalFee = 0;
	}
	
	public Employee(int id, String name, int baseSalary, int generalFee){
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
		this.generalFee = generalFee;
	}
	
	void calc() {
		this.totalSalary = this.baseSalary + this.generalFee;
	}
}

class Manager extends Employee{
	int manFee;
	
	Manager(int id, String name, int baseSalary, int generalFee, int manFee){
		super(id, name, baseSalary, generalFee);

		this.manFee = manFee;
	}
	
	@Override
	void calc() {
		//this.totalSalary = this.baseSalary + this.generalFee + this.manFee;
		super.calc();
		this.totalSalary += this.manFee;
	}
}

class Engineer extends Employee{
	int techFee; //기술수당
	int certiFee; //자격수당
	
	public Engineer(int id, String name, int baseSalary, int generalFee, int techFee, int certiFee){
		super(id, name, baseSalary, generalFee);
		this.techFee = techFee;
		this.certiFee = certiFee;
	}
	
	@Override
	void calc() {
		//this.totalSalary = this.baseSalary + this.generalFee + this.manFee;
		super.calc();
		this.totalSalary += this.techFee;
		this.totalSalary += this.certiFee;
	}
}

class Secretary extends Employee{
	int secFee;

	public Secretary(int id, String name, int baseSalary, int generalFee, int secFee) {
		super(id, name, baseSalary, generalFee);
		this.secFee = secFee;
	}
	
	@Override
	void calc() {
		//this.totalSalary = this.baseSalary + this.generalFee + this.manFee;
		super.calc();
		this.secFee += this.secFee;
	}
}


public class d1213_5_SalaryTest {
	
	public static void main(String args[]) {
		
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee(1000,"이사원",10000,5000);
		e[1] = new Manager(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"최비서",15000,7000,10000);
		
		System.out.println("사번 : 이름 : 본봉 : 총급여");
		for(int i = 0 ; i < e.length; i++) {
			e[i].calc();
			System.out.println(e[i].id + ":" + e[i].name + ":" + e[i].baseSalary + ":" + e[i].totalSalary);
			if(e[i] instanceof Engineer) {
				System.out.println("기술직사원의 경우 : " + ((Engineer)e[i]).techFee + " , " + ((Engineer)e[i]).certiFee);
			}
		}
		/* 배열 내의 각 객체의
		 급여계산메소드 호출하고
		사번, 이름, 총급여 출력
		 단, 기술직 사원은 기술수당, 자격수당도 출력
		 
		 사번:이름:본봉:총급여
		1000:이사원:10000:xxxxx
		2000:김간부:20000:xxxxx
		3000:박기술:15000:xxxxx
		기술직사원의 경우 : 기술수당 자격수당
		4000:최비서:15000:xxxxx
		*/ 
		
	}
}

/*
각 직종의 회사원들의 급여를 계산하시오.
(객체 형변환, 생성자, super 특징)
- 패키지명 다르게 저장
회사원(Employee class){
- 멤버변수=필드변수 선언
 사번 이름 본봉 일반수당 총급여
- 생성자 정의(main 참고)
new Employee(1000,"이사원",10000,5000);
(총급여 제외한) 
 매개변수 4개의 값을 멤버변수 값으로 초기화.
- 급여 계산메서드(): 
 총급여 = 본봉 + 일반수당
}
간부직(Manager class) : 상속
- 변수 선언(상속 자동포함 제외 , 추가 변수 선언)
 사번 이름 본봉 일반수당 총급여 간부수당
- 생성자 정의
new Manager(2000,"김간부",20000,10000,10000);
 (Manager 생성자 내부 첫문장 super() ; 정의
 Employee() 생성자 호출)
- 급여 계산메서드()
 총급여 = 본봉 + 일반수당+간부수당 
}
기술직(Engineer class):상속
- 변수 선언
 이름 사번 본봉 일반수당 총급여
자격수당 기술수당
- 생성자 정의:main
- 급여 계산메서드()
 총급여 = 본봉 + 일반수당+자격수당+기술수당
비서직(Secretary class) :상속
- 변수 선언
 이름 사번 본봉 일반수당 총급여
 비서수당
- 생성자 정의
- 급여 계산메서드()
 총급여 = 본봉 + 일반수당+비서수당
//====== 4개 클래스 정의 ================
*/