package chap11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class d1219_5_ComparatorTest {

	public static void main(String[] args) {
		
		String[] animals = {"lion", "Snake", "tiger", "dog"};
		
		//사전 순서
		// 숫자 > 특수문자일부 > 대문자 > 소문자 > 한글 ==> 오름차순
		
		Arrays.sort(animals);
		//Arrays.sort(animals, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(animals));
		
		//내림차순
		class MyComparator implements Comparator{
			
			@Override
			public int compare(Object o1, Object o2) {
				if(!(o1 instanceof String && o2 instanceof String)) {
					return -1;
				}
				String s1 = (String)o1;
				String s2 = (String)o2;
				return s1.compareTo(s2) * -1;
			}
		}
		
		MyComparator mc = new MyComparator();
//		System.out.println(mc.compare("abc", "def"));//음수 - 작다
//		System.out.println(mc.compare("def", "abc"));//양수 - 크다
//		System.out.println(mc.compare("abc", "abc"));//0 - 같다
		Arrays.sort(animals, mc);
		System.out.println(Arrays.toString(animals));
	}
}