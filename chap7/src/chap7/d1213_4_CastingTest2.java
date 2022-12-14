package chap7;

public class d1213_4_CastingTest2 {
	
	void setParent(Parent target) {
		Parent p = target;
	}
	
	public static void main(String[] args) {
		
		d1213_4_CastingTest2 ct2 = new d1213_4_CastingTest2();
		ct2.setParent(new Child1());
		ct2.setParent(new Child2());
		ct2.setParent(new Parent());
		
		/*	Parent array [] = new Parent[3];
		//자동형변환 - 여러가지 타입 객체 1개 타입 통일. 호환
		array[0] = new Parent();
		array[1] = new Child1();//자동형변환
		array[2] = new Child2();//자동형변환
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].getClass().getName() + ":" + i + "번인덱스객체 : ");
			array[i].print();//overriding메소드 서로 다르다
			//Child2 객체인 경우 mc2() 호출
			if(array[i] instanceof Child2 ) {
				System.out.println("if문 : " + i);
				((Child2)array[i]).mc2();
			}
		}
		*/
	}
}