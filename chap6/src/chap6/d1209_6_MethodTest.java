package chap6;




class B{
	int m1(){
		int local = 10;
		return local * 10;
	}
	
	int m2(int param){
		return param * 10;
	}
	
	String m3(int param1, int param2){
		return param1 * param2 + "결과를 리턴합니다.";
	}
	
	int[] m4(int[] ar){
		int []result = new int[ar.length];
		// ar 배열 각 요소에 * 10 베열 저장 리턴
		for(int i = 0; i < ar.length; i++) {
			result[i] = ar[i] * 10;
		}
		
		return result;
	}
	
	void m5() {
		System.out.println("B 클래스에서 메소드를 테스트합니다.");
	}
}

public class d1209_6_MethodTest {

	public static void main(String[] args) {
		
		B b1 = new B();
		int result1 = b1.m1();
		System.out.println(result1);
		System.out.println(b1.m2(5));
		System.out.println(b1.m2(50));
		System.out.println(b1.m3(6,8));
		
		int main_ar[] = {10, 20, 45, 1, 3};
		int[] main_result = b1.m4(main_ar);
		for(int i = 0 ; i < main_result.length;i++) {
			System.out.print(main_result[i] + " ");
		}
		System.out.println();
		
		b1.m5();
	}

}
