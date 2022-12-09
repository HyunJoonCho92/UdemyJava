package test;

class Member{
	String id;
	int pw;
	String name;
	int age;
	
	void insert(String id, int pw, String name, int age) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		System.out.println("------------------------------------");
		System.out.println("아이디 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("가입이 완료되었습니다.");
		System.out.println("------------------------------------");
	}
	
	void login(String id, int pw) {
		// id pw 같으면 ㄱㄱ
		if(this.id.equals(id) && (this.pw == pw)) {
			System.out.println("------------------------------------");
			System.out.println("로그인 되었습니다.");
			System.out.println("------------------------------------");
		}
		else{
			System.out.println("------------------------------------");
			System.out.println("로그인 정보를 확인하세요.");
			System.out.println("------------------------------------");
		}
	}
	
	void setPassword(int pw) {
		this.pw = pw;
		System.out.println("------------------------------------");
		System.out.println("암호를 변경하셨습니다.");
		System.out.println("------------------------------------");
	}
	
	void getMyInfo() {
		System.out.println("------------------------------------");
		System.out.println("아이디 : " + this.id + " 회원님 정보는 다음과 같습니다.");
		System.out.println("암호 : " + this.pw);
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("------------------------------------");
	}
	
	String logout() {
		System.out.println("------------------------------------");
		System.out.println("로그아웃 되었습니다.");
		System.out.println("------------------------------------");
		this.id = null;
		this.pw = -1;
		this.name = null;
		this.age = -1;
		return this.id;
	}
}

public class d1209_10_Test2 {

	public static void main(String[] args) {
		Member mem = new Member();
		mem.insert("test", 1234, "이자바", 25);
		mem.login("test", 4321);
		mem.login("test", 1234);
		mem.setPassword(1111);
		mem.getMyInfo();
		String id  = mem.logout();
		if(id == null){
			System.out.println("다시 로그인하셔야 합니다.");
		}

	}

}
