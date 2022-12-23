package generic1;


class Apple {
	String origin;
	
	public Apple(String origin) {
		this.origin = origin;
	}
}

class Paper{
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
class Box<T>{
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
		
		System.out.println( aBox.contents.origin );
		System.out.println( pBox.contents.size );
		
//		Box wBox = new Box(new Wine("로제와인")); // 이건 안됨 <Wine> 해주기
		Box<Wine> wBox = new Box(new Wine("로제와인"));
		System.out.println(wBox.contents.kind);
	}
}