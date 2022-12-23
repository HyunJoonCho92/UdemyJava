package generic2;

import java.util.HashMap;
import java.util.Set;

public class d1219_3_HashMapTest {

	public static void main(String[] args) {
		// 식별자 - 데이터
		HashMap map = new HashMap();
		map.put("hong@email.com", "홍길동");
		map.put("hong@email.com", new String[]{"홍길동", "010-2222-2222", "031-444-5555", "02-111-2222"}); // 위에 것과 키가 같기 때문에 value 값 바뀜
		map.put("lee@email.com", new String[] {"이자바", "2000-12-12"} );
		map.put("lee@sba.net", new String[] {"김새싹", "용산캠퍼스"});
		
		System.out.println(map.size());
		
		//조회
		//키들을 조회
		Set keys = map.keySet();
		for(Object onekey : keys) {
			String[] value = (String[])(map.get(onekey));
			System.out.print("키 = " + onekey);
			for(String one : value) {
				System.out.print(one + ":");
			}
			System.out.println();
		}
		
		
	}

}
