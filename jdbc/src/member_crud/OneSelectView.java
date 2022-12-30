package member_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class OneSelectView implements View {

	@Override
	public void input() {
		
		Scanner key = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = key.next();
		System.out.println("암호 입력 : ");
		String pw = key.next();
		
		
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = dao.getMember(id, pw);

		//id 일치하면 pw 일치하면 - 정보 저장 리턴
		//id 일치하면 pw 불일치하면 - 4번 암호 맞지 않습니다.(id만 저장)
		//id 불일치하면 pw 일치하면 - 1번 회원가입부터 하세요 (DTO NULL)
		//System.out.println("'" + dto.getId() + "'");
		if(dto != null && dto.getId() != null) {
			System.out.println(dto);
		}
	}
}