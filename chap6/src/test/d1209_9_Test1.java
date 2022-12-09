package test;

/*
 * 교육생 객체 표현 클래스 
 * 1. 변수 -이름, 과정명, 교육기관 , 교육비, 부가금, 환급비
 * 2. 단, 교육기관 = 새싹 모든 교육생동일 공유
 * 3. 단, 부가금 = 5000 수정불가능
 * 4. 메소드 - ? calc (?)
 * 4-1. 과정명이 "자바" 이면 환급금 = 교육비의 20% + 부가금
 * 4-2.  과정명이 "jsp" 이면 환급금 = 교육비의 15% + 부가금*2
 * 4-3.  과정명이 "spring" 이면 환급금 = 교육비의 10% + 부가금
 * 4-4.  그외의 과정명은 환급금 = 0
 * 
 * 실행 main 메소드 클래스
 * */

class Student{
	String name; //이름
	String className; //과정명
	static String institution = "새싹"; // 교육기관
	int eduCost; // 교육비
	final int surchange = 5000; // 부가금
	double refund; //환급비
	
	void calc() {
		if(this.className == "자바") {
			this.refund = this.eduCost * 0.2 + this.surchange;
			System.out.println("이름 : " + this.name);
			System.out.println("과정명 : " + this.className);
			System.out.println("교육비 : " + this.eduCost);
			System.out.println("교육기관 : " + institution);
			System.out.println("부가금 : " + this.surchange);
			System.out.println("환급비 : " + this.refund);
			
		}
		else if(this.className == "jsp") {
			this.refund = this.eduCost * 0.15 + this.surchange * 2;
			System.out.println("이름 : " + this.name);
			System.out.println("과정명 : " + this.className);
			System.out.println("교육비 : " + this.eduCost);
			System.out.println("교육기관 : " + institution);
			System.out.println("부가금 : " + this.surchange);
			System.out.println("환급비 : " + this.refund);
		}
		else if(this.className == "spring") {
			this.refund = this.eduCost * 0.1 + this.surchange;
			System.out.println("이름 : " + this.name);
			System.out.println("과정명 : " + this.className);
			System.out.println("교육비 : " + this.eduCost);
			System.out.println("교육기관 : " + institution);
			System.out.println("부가금 : " + this.surchange);
			System.out.println("환급비 : " + this.refund);
		}
		else {
			this.refund = 0;
			System.out.println("이름 : " + this.name);
			System.out.println("과정명 : " + this.className);
			System.out.println("교육비 : " + this.eduCost);
			System.out.println("교육기관 : " + institution);
			System.out.println("부가금 : " + this.surchange);
			System.out.println("환급비 : " + this.refund);
		}
	}
}




public class d1209_9_Test1 {

	public static void main(String[] args) {
		/*
		교육생 a1 = new 교육생();
		이름, 과정명, 교육비  명령행 매개변수 입력값 할당
		교육생 환급비 계산 메소드 호출
		결과 리턴 출력
		이름 : xxx
		과정명 : xxx
		교육비 :xxx
		교육기관 : 새싹
		부가금 : 5000
		환급비 : xxx
		*/
		
		Student a1 = new Student();
		a1.name = "조현준";
		a1.className = "자바";
		a1.eduCost = 1000000;
		
		a1.calc();

		
	}
}
