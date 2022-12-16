package chap9;

public class d1216_3_WrapperTest {

	public static void main(String[] args) {

//		int i = 10 ;
//		System.out.println(Integer.toBinaryString(i));
//		System.out.println(Integer.toOctalString(i));
//		System.out.println(Integer.toHexString(i));
		
		//auto boxing / auto unboxing
		Integer in = new Integer(10); //사용 권하지않음
		int i = 10; // 10정수. 연산자 이용
		
		int i2 = new Integer(10); // 사용 권하지 않음
		Integer in2 = 10;
		
		//jdk 1.9 추가. Integer 생성자 사용자제 권고
		int i3 = 10;
		Integer in3 = 10;
	}
	
	
	
	
	

}
