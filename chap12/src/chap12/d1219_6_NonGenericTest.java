package chap12;


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

class Box{
	Object contents;
	
	public Object getContents() {
		return contents;
	}
	
	public void setContents(Object contents) {
		this.contents = contents;
	}
	
	public Box(Object contents) {
		super();
		this.contents = contents;
	}
}

public class d1219_6_NonGenericTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("대구");
		Paper p = new Paper("A4");
		Box aBox = new Box(a);
		Box pBox = new Box(p);
		
		System.out.println( ((Apple)aBox.contents).origin );
		System.out.println( ((Paper)pBox.contents).size );
		
//		Box<Wine> wBox = new Box(new Wine("로제와인")); // 이건 안됨 <Wine> 해주기
		Box wBox = new Box(new Wine("로제와인"));
		System.out.println(((Wine)wBox.contents).kind);
	}
}