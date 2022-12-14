package inter;

class StudentWorker implements d1214_3_Student, d1214_2_Worker{
	
	//String dept = "전산학과" //Worker 인터페이스에 있음
	//double score = 4.5 // Student 인터페이스에 있음
	String title = "조교";

	@Override
	public void work() {
		System.out.println("학교일하다.");
	}

	@Override
	public void study() {
		System.out.println("도서관에서 공부하다.");
	}

	@Override
	public void lunch() {
		System.out.println("학생식당이나 교직원식당에서 점심먹다.");	
	}
	
	//생성자 변수 메소드 추가 가능
	void team() {
		System.out.println("조교모임 참석하다.");
	}
	
}

public class d1214_1_interfaceTest {

	public static void main(String[] args) {
		
		//Worker w = new Worker(); //인터페이스로 생성 불가능
		
		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.lunch();
		sw.work();
		sw.team();
		
		sw.title = "조교아님";
		//sw.dept = "국문학"; //오류. Worker인터페이스에서 상속받는데 static, final 이기 때문에
							//읽기만 가능
		//sw.score = 3.5; //위와 같은 이유
		
		System.out.println(sw.title);
		System.out.println(sw.dept); //Worker에서 상속
		System.out.println(d1214_2_Worker.dept);
		System.out.println(sw.score); //Student에서 상속
		System.out.println(d1214_3_Student.score);
		
		d1214_2_Worker w = new StudentWorker();
		
//		1. 자동형변환 이후에
//		2. w.non-overriding메소드 --> worker인터페이스
//		3. w.overriding메소드 --> StudentWorker 클래스
//		4. Worker 인터페이스 포함 - StudentWorker
//		5. work() / lunch()
		
		//w.study(); // 안됨. Study 인터페이스에 있기 때문에
		w.lunch();
		w.work();
		//w.team(); //안됨 studentWorker 클래스에 있는 메소드라서
		
		
		d1214_3_Student s = new StudentWorker();
		
//		1. 자동형변환 이후에
//		2. s.non-overriding메소드 --> Student인터페이스
//		3. s.overriding메소드 --> StudentWorker 클래스
//		4. Student 인터페이스 포함 - StudentWorker
//		5. study() / lunch()
		
		s.study();
		s.lunch();
		//s.work(); //안됨 Worker 인터페이스에 있는 메소드이기 때문에
		//s.team(); //안됨 studentWorker 클래스에 있는 메소드라서
	}
}