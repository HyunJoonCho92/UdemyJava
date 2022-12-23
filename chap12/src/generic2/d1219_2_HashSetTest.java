package generic2;

import java.util.HashSet;
import java.util.Iterator;

public class d1219_2_HashSetTest {

	public static void main(String[] args) {
		
		HashSet set = new HashSet(10);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(5); // 해쉬는 중복 저장 안한다.
		
		System.out.println("hashset에 저장된 갯수 : " + set.size());
		
		System.out.println("=============================================================");
		HashSet lottoSet = new HashSet(6);
		
		while(!(lottoSet.size() == 6)) {
			int ran = (int)(Math.random()*44) + 1;
			lottoSet.add(ran); 
		}

		System.out.println("lottoSet에 저장된 정보 갯수 : " + lottoSet.size());		
		
		System.out.println("============================================================");

		Iterator it = lottoSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		// 방법2
		for(Object oneLotto : lottoSet) {
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
