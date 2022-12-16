package chap9;

public class d1215_4_ObjectClassTest {

	public static void main(String[] args) {

		MyObject o1 = new MyObject("myobject");
		MyObject o2 = new MyObject("myobject");
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		System.out.println(o1 == o2); //주소 값 비교
		System.out.println(o1.equals(o2));
		
		String s3 = new String("myobject");
		System.out.println(o1);
		System.out.println(s3);
		System.out.println(o1.equals(s3));
	
	}

}


class MyObject /*extends Object*/{
	String message;
	
	MyObject(String message){
		this.message = message;	
	}
	
	//toString 오버라이딩
	@Override
	public String toString() {
		return this.message;
	}

	// equals 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//비교 전달 객체 obj MyObject 타입이어야 하고.
		//message 변수값 같은지 비교
		
		if(obj instanceof MyObject) {
			return message.equals(((MyObject)obj).message);
		}
		else {
			return false;
		}
			
	}
	
	
}