package generic2;

import java.util.ArrayList;

class Solid{
	public String tellName() {
		return "고체";
	}
}
class Apple extends Solid{
	String origin;
	
	public Apple(String origin) {
		this.origin = origin;
	}
}

class Paper extends Solid{
	String size;
	public Paper(String size) {
		this.size = size;
	}
}

class Wine{
	String kind;
	public Wine(String kind) {
		this.kind = kind;
	}
}

//클래스명 아니다. T-type 매개변수
//BOX - 원시타입
class Box<T extends Solid>{
	T contents;
	
	public T getContents() {
		return contents;
	}
	
	public void setContents(T contents) {
		this.contents = contents;
	}
	
	public Box(T contents) {
		super();
		this.contents = contents;
	}
}

public class d1219_6_NonGenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box<Apple> aBox = new Box(a);
		Box<Paper> pBox = new Box(p);
		Box<Solid> sBox = new Box(new Solid());
		
		ArrayList<Solid> list = new ArrayList();
		
		list.add(a);
		list.add(p);
		
		System.out.println( aBox.contents.origin );
		System.out.println( pBox.contents.size );
//		Box wBox = new Box(new Wine("로제와인"));
	}
}