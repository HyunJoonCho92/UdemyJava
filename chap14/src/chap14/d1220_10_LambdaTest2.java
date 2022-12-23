package chap14;
//함수형 인터페이스
@FunctionalInterface
interface Calculable{
	int sum(int a, int b);
}

@FunctionalInterface
interface MyFunction{
	public int getValue(int x, int y);
}

@FunctionalInterface
interface GenericInterface<T>{
	public T getValue(T x, T y);
}

public class d1220_10_LambdaTest2 {
	
	static int test(MyFunction fu, int a, int b) {
		return fu.getValue(a, b);
	}

	public static void main(String[] args) {
		
		// test3 generic
		GenericInterface<String> gen = (str1,str2) -> {  return str1 + str2;  };
		GenericInterface<Integer> gen2 = (str1,str2) -> str1 + str2;
		String result = gen.getValue("람다", "식");
		int result2 = gen2.getValue(10, 20);
		System.out.println(result);
		System.out.println(result2);
		
		
		// test2 람다식 매개변수
		MyFunction mf = (x, y) -> x>y ? x:y;
		int maxValue = test(mf, 10, 5);
		System.out.println(maxValue);
		
		// test1 람다식 유형
		Calculable calc = null;
		
		// 1. 함수형 인터페이스 무명 클래스 구현
		calc = new Calculable() {
			@Override
			public int sum(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println(calc.sum(11, 22));
		
		// 2. 람다식
		calc = (int a, int b) -> { return a+b; };
		System.out.println(calc.sum(11, 22));
		
		//매개변수 타입 생략. return 생략
		calc = (a, b) -> a+b;
		System.out.println(calc.sum(11, 22));
		
		//Arrays.setA
	}
}