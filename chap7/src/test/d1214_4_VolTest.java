package test;

interface Volume{
	void volumeUp(int vol);
	void volumeDown(int vol);
	
	//static 메서드는 그냥 사용해도 되는 메소드
	static void print1(String name) {
		System.out.println(name + " 클래스가 볼륨업 수행중입니다.");
	}
	
	static void print2(String name) {
		System.out.println(name + " 클래스가 볼륨다운 수행중입니다.");
	}
	
	//default
	default void print3() {
		System.out.println("뒤늦게 메소드 추가 - 자식클래스 오버라이딩 선택적");
	}
}

class Speaker implements Volume{
	int VolLevel;
	Speaker(int vol){
		this.VolLevel = vol;
	}
	
	// -100 ~ 100
	public void volumeUp(int vol) {
		Volume.print1("Speaker");
		this.VolLevel += vol;
		if(this.VolLevel > 100) {
			this.VolLevel = 100;
		}
		System.out.println("현재 speaker의 볼륨 = " + this.VolLevel);
	}
	
	public void volumeDown(int vol) {
		Volume.print2("Speaker");
		this.VolLevel -= vol;
		if(this.VolLevel < -100) {
			this.VolLevel = -100;
		}
		System.out.println("현재 speaker의 볼륨 = " + this.VolLevel);
	}
	
	// 오버라이딩. public 써줘야함.
	public void print3() {
		System.out.println("Speaker클래스에서 오버라이딩 합니다.");
	}
}

class Radio implements Volume{
	int VolLevel;
	Radio(int vol){
		this.VolLevel = vol;
	}
	
	public void volumeUp(int vol) {
		Volume.print1("Radio");
		this.VolLevel += vol;
		System.out.println("현재 Radio의 볼륨 = " + this.VolLevel);
	}
	
	public void volumeDown(int vol) {
		Volume.print2("Radio");
		this.VolLevel -= vol;
		System.out.println("현재 Radio의 볼륨 = " + this.VolLevel);
	}
}

class TV implements Volume{
	int VolLevel;
	TV(int vol){
		this.VolLevel = vol;
	}
	
	public void volumeUp(int vol) {
		Volume.print1("TV");
		this.VolLevel += vol;
		System.out.println("현재 TV의 볼륨 = " + this.VolLevel);
	}
	
	public void volumeDown(int vol) {
		Volume.print2("TV");
		this.VolLevel -= vol;
		if(this.VolLevel < 0) {
			this.VolLevel = 0;
		}
		System.out.println("현재 TV의 볼륨 = " + this.VolLevel);
	}
}


public class d1214_4_VolTest {

	public static void main(String[] args) {
		
		Volume v[] = new Volume[3];
		
		//서로 다른 클래스에 관계 맺어준다.
		v[0] = new Speaker(50);
		v[1] = new TV(40);
		v[2] = new Radio(30);

		for(int i = 0 ; i < v.length; i++) {
			v[i].volumeUp(200);
			v[i].volumeDown(300);
			v[i].print3();
		}
		
		
		
//		Volume.print();
//		Radio radio = new Radio();
//		TV tv = new TV();
//		Speaker speaker = new Speaker();
//		Volume vol[] = new Volume[3];
//		
//		//인터페이스에 개체 할당
//		vol[0] = radio;
//		vol[1] = tv;
//		vol[2] = speaker;
//		
		//개체를 이용한 메서드 호출

	}

}
