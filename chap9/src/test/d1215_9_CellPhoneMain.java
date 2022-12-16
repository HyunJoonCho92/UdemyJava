package test;


class CellPhone{
	
	String model;
	double battery;
	
	CellPhone(String model){
		this.model = model;
	}
	
	void call(int time) {
		if(time < 0) {
			throw new IllegalArgumentException("통화시간입력오류");
		}
		this.battery -= (time * 0.5);
		if(this.battery < 0 ) {
			this.battery = 0;
		}
		
		System.out.println("통화 시간 : " + time);
		
	}
	
	void charge(int time) {
		if(time < 0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}
		this.battery += (time * 3);
		if(this.battery > 100) {
			this.battery =100;
		}
		System.out.println("충전 시간 : " + time);
	}
	
	
	void printBattery() {
		System.out.println("남은 배터리 양 : " + this.battery);
	}
	
	public boolean isSame(Object obj) {
		return this.model == ((CellPhone)obj).model;
	}
	
	
}

public class d1215_9_CellPhoneMain {

	public static void main(String[] args) {
		
		CellPhone myPhone = new CellPhone("GALAXY-7");
		
		// charge, call 메소드 호출 포함하여 try-catch 블록 정의
		// throws 하고 있는 예외 처리한다.
		// 각 예외 발생시 어떤 메소드에서 어떤 원인으로 발생했는지
		// 출력한다.

		
		myPhone.charge( 20 ); //20분간 충전을 한다.
		myPhone.printBattery();

		myPhone.call( 300 ); //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 ); //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 ); //40분간 통화를 한다.
		myPhone.printBattery();
		
		try {
			myPhone.call( -20 ); //통화시간입력오류
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		CellPhone yourPhone = new CellPhone("galaxy-7");
		
		if( myPhone.isSame(yourPhone) ) {
		System.out.println("동일 모델입니다.");
		} else {
		System.out.println("다른 모델입니다.");
		} 
	}

}
