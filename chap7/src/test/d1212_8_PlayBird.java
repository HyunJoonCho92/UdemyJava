package test;
class Bird{
	String name;
	int legs;
	int length;
	
	void fly() {
		System.out.println("날다");
	}
	
	void sing() {
		System.out.println("노래 부르다");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void print() {
		System.out.println(this.name);
	}
}

class Duck extends Bird{
	int web;
	
	Duck(){
		this.name = "꽥꽥이";
		this.legs = 2;
	}
	
	void fly() {
		System.out.println("오리(" + this.name + ")는 날지 않습니다.");
	}
	
	void sing() {
		System.out.println("오리(" + this.name + ")가 소리내어 웁니다.");
	}
	
	void print() {
		System.out.println("오리의 이름은 " + this.name + " 입니다.");
	}
	
	void swim() {
		System.out.println("오리(" + this.name + ")가 " + this.legs + "개의 물갈퀴로 수영합니다.");
	}
}

class Sparrow extends Bird{
	String friend;
	
	Sparrow() {
		this.name = "짹짹";
	}
	
	void fly() {
		System.out.println("참새(" + this.name + ")가 날아다닙니다.");
	}
	
	void sing() {
		System.out.println("참새(" + this.name + ")가 소리내어 웁니다.");
	}
	
	void print() {
		System.out.println("참새의 이름은 " + this.name + " 입니다.");
	}
	
	void makeFriend() {
		friend = "허수아비";
		System.out.println("참새의 친구는 " + this.friend + "입니다.");
	}
}

public class d1212_8_PlayBird {

	public static void main(String[] args) {
		Duck d = new Duck();
		Sparrow s = new Sparrow();
		
		d.fly();
		d.sing();
		d.swim();
		d.print();
		
		s.fly();
		s.sing();
		s.makeFriend();
		s.print();
	}
}