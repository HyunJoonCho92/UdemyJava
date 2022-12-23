package chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d1219_4_ArraysTest {

	public static void main(String[] args) {
		
		int []arr = {0, 1, 2, 3, 4};
		int [][]arr2 = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
		
		//배열 조회
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2)); //2차원 배열 이상은 deepToString하면 원하는값이 나옴

		//int[] arr_copy = Arrays.copyOf(arr,  3);
		int[] arr_copy = Arrays.copyOfRange(arr,  2, 5);
		arr_copy[0] = 20;
		
		System.out.print(Arrays.toString(arr_copy));
		System.out.println("비교 ===> " + Arrays.toString(arr));
		
		int []arr10 = {0, 1, 2, 3, 4};
		int []arr20 = {0, 1, 2, 3, 4};
		System.out.println(Arrays.equals(arr10, arr20));
		
		//정렬 전
		int ran[] = {45, 1, 23, 889, 99};
		//정렬 후
		Arrays.sort(ran);
		System.out.println(Arrays.toString(ran));
		
		//타입 변환 - 배열과 ArrayList( 정적 / 동적 - 동일 / 다른타입)
		List list = Arrays.asList(ran);
		//인터페이스타입 형변환  
		
		
		//ArrayList를 배열로 변환
		ArrayList list2 = new ArrayList(5);
		list2.add("java");
		list2.add(10);
		list2.add(3.14);
		Object [] list_arr = new Object[list2.size()];
		list2.toArray(list_arr);
		System.out.println(Arrays.toString(list_arr));
	

	}

}
