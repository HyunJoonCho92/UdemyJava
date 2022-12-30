package member_crud;

import java.util.Scanner;

public class MemberInsertView implements View {

	@Override
	public void input() {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("아이디 입력 : ");
		String id = key.next();
		System.out.println("암호 입력 : ");
		String pw = key.next();
		System.out.println("이름 입력 : ");
		String name = key.next();
		System.out.println("이메일 입력 : ");
		String email = key.next();
		System.out.println("폰번호 입력 : ");
		String phone = key.next();
		
		//이거 해야주소 입력할 수 있음.
		key.nextLine();
		
		System.out.println("주소 입력 : ");
		String address = key.nextLine();

		//MemberDTO - MEMBER테이블 컬럼들 변수 --> MemberDAO
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPhone(phone);
		dto.setAddress(address);
		
		System.out.println(dto.toString());
		
		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(dto);
		System.out.println(result + " 명의 회원정보 입력 완료");
		
	}
}