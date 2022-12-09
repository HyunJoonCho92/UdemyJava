package chap6;

class Person{
	String name;
	int age;
	static String nation = "대한민국"; // 모든 객체 공통값
}

public class d1209_5_StaticTest {

	public static void main(String[] args) {
		
		System.out.println("모든 사람들의 국적은 " + Person.nation + " 입니다.");
		
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 22;
		//p1.nation = "한국";
		
		System.out.println(p1.name + " : " + p1.age + " : " + p1.nation);
		
		Person p2 = new Person();
		p2.name = "이철수";
		p2.age = 32;
		//p2.nation = "한국";
		
		System.out.println(p2.name + " : " + p2.age + " : " + p2.nation);

	}

}
