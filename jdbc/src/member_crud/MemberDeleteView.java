package member_crud;

public class MemberDeleteView implements View{

	@Override
	public void input() {
		
		OneSelectView view = new OneSelectView();
		view.input();
		MemberDTO dto = view.getDto();
		
		if(dto == null || dto.getPw() == null) {
			System.out.println("그런 계정 없음");
			return;
		}
		
		MemberDAO dao = new MemberDAO();

		dao.deleteMember(dto.getId());
	}	
}