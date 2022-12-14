package chap7;

abstract class Shape{
	
	abstract void area(); //면적
	abstract void circum(); //둘레
	
	void print() {
		System.out.println("면적과 둘레 출력 기능 ");
	}
}

class Rectangle extends Shape{
	int width;
	int height;
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	Rectangle(String width, String height){
		this.width = Integer.parseInt(width);
		this.height = Integer.parseInt(height);
	}
	
	@Override
	void area() {
		System.out.println("사각형 면적 : " + (this.width*this.height));
	}
	@Override
	void circum() {
		System.out.println("사각형 둘레 : " + (2*this.width + 2*this.height));
	}
}

class Circle extends Shape{
	int radius;
	public final static double pi = 3.14;
	
	Circle(int radius){
		this.radius = radius;
	}
	Circle(String radius){
		this.radius = Integer.parseInt(radius);
	}
	
	@Override
	void area() {
		System.out.println("원 면적 : " + (pi * this.radius * this.radius));
	}
	@Override
	void circum() {
		System.out.println("원 둘레 : " + (2*pi*this.radius));
	}
	
}

public class d1213_6_ShapeTest {

	public static void main(String[] args) {
		// 명령행 매개변수 입력
		// rect 6 8 - 3개 입력받고 첫번째 "rect"이면
		// Rectangle 객체 생성
		// 면적 - area() 호출 - 두, 세번째 가로, 세로 면적 출력
		
		// cir 5 - 2개 입력받고 첫번째 "cir"이면
		// Circle 객체 생성
		// 두번째 반지름, 면적 둘레
		
		// 면적과 둘레 구할 수 있어야 한다. 구현 필수
		
		Shape s = null;
		if(args.length == 3 && args[0].equals("rect")) {
			s = new Rectangle(args[1], args[2]);
		}
		else if(args.length == 2 && args[0].equals("cir")) {
			s = new Circle(args[1]);
		}
		else {
			System.out.println("지원되지 않는 도형입니다.");
		}
		
		s.area();
		s.circum();
		

	}

}
