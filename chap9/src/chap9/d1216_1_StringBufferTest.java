package chap9;

public class d1216_1_StringBufferTest {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("초기값");
		StringBuffer sb3 = new StringBuffer(100);
		
		System.out.println("sb1의 문자열 갯수 = " + sb1.length());
		System.out.println("sb2의 문자열 갯수 = " + sb2.length());
		System.out.println("sb3의 문자열 갯수 = " + sb3.length());
		
		System.out.println("sb1의 용량" + sb1.capacity());
		System.out.println("sb2의 용량" + sb2.capacity());
		System.out.println("sb3의 용량" + sb3.capacity());
		
		sb2.append("추가한값");
		sb2.append("추가한값");
		sb2.append("추가한값");
		sb2.append("추가한값");
//		sb2.append("추가한값");
//		sb2.append("추가한값");
//		sb2.append("추가한값");
		sb2.append("추가한값");
		System.out.println("sb2의 문자열 갯수 = " + sb2.length());
		System.out.println("문자열 추가 후 sb2의 용량" + sb2.capacity());
		
		String s2 = new String("초기값");
		System.out.println(s2.length());
		System.out.println(s2.length());

	}

}
