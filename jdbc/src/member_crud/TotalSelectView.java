package member_crud;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalSelectView implements View {

	@Override
	public void input() {
		
		// ex) 10명이 저장 됐을 때, 1페이지당 3명
		// member테이블 전체데이터갯수조회
		// select * from member
		Scanner key = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		int total = dao.getTotalMember();
		int pagenum = 0;
		
		int memberPerPage = 3;
		
		if(total % 3 == 0) {
			pagenum = total / memberPerPage;
		}
		else {
			pagenum = total / memberPerPage + 1;
		}
		System.out.println("1 ~ " + pagenum + " 페이지까지 입력 가능합니다.");
		
		System.out.println("페이지번호 입력 : ");
		int currentpage = key.nextInt();
		
		ArrayList <MemberDTO> list = dao.getMemberList(currentpage, memberPerPage);
		
		for(MemberDTO d : list) {
			System.out.println(d);
		}
	}
}