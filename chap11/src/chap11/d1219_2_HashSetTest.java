package chap11;

import java.util.HashSet;
import java.util.Iterator;

public class d1219_2_HashSetTest {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet(10);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5); // 해쉬는 중복 저장 안한다.
		
		System.out.println("hashset에 저장된 갯수 : " + set.size());
		
		System.out.println("=============================================================");
		HashSet<Integer> lottoSet = new HashSet(6);
		
		while(!(lottoSet.size() == 6)) {
			int ran = (int)(Math.random()*44) + 1;
			lottoSet.add(ran); 
		}

		
//		이런 식으로 하기 힘들다. 그리고 답도 틀림. 중복 나올수도 있어서
//		for(int i = 1; i <= 6; i++) {
//			int ran = (int)(Math.random()*44) + 1;
//			System.out.println(ran);
//		}
		
		System.out.println("lottoSet에 저장된 정보 갯수 : " + lottoSet.size());
		
		
		System.out.println("============================================================");
//		Iterator - 저장, 수정 목적이 아닌 "조회"하기 위해
//					 데이터 반복적으로 조회 기능만 있는 컬렉션 종류
		Iterator<Integer> it = lottoSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		//조회 다른 방법
		for(Integer oneLotto : lottoSet) {
			System.out.println(oneLotto + " ");
		}
		
		System.out.print("\n===========================================================\n");
		
		String s[] = new String[] {"a", "b", "c"};
		for(int i = 0 ; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		
		for(String one : s) {
			System.out.print(one + " ");
		}
		
		
	}

}
