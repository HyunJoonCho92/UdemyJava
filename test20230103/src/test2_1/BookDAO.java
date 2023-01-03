//  미완성, 미완성, 미완성, 미완성, 미완성

package test2_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import member_crud.ConnectionInform;
import member_crud.MemberDTO;

public class BookDAO {
	
	int insertMember(MemberDTO dto){
		// dto 전달 내용을 member 테이블 입력
		// 회원가입일 now() 설정
		
		Connection con = null;
		int count = 0;
		
		MemberDTO selecteddto = getMember(dto.getId(), dto.getPw());//연결 - 해제
		if(selecteddto != null) {
			System.out.println("아이디 중복입니다. 다른 아이디를 입력하세요");
			return 0;//메소드 중단
		}
		
		try {
			//0. jdbc driver 호출 - jdk 비포함
			Class.forName(ConnectionInform.DRIVER_CLASS);
			
			// 1. db 연결
			con = DriverManager.getConnection
					(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			
			System.out.println("연결 성공");
			System.out.println(con.getAutoCommit());
			
			String sql = "INSERT INTO member " +
						 "VALUES(?, ?, ?, ?, ?, ?, now());";
			
			PreparedStatement pt = con.prepareStatement(sql);
			
			pt.setString(1, dto.getId());
			pt.setString(2, dto.getPw());
			pt.setString(3, dto.getName());
			pt.setString(4, dto.getPhone());
			pt.setString(5, dto.getEmail());
			pt.setString(6, dto.getAddress());
			
			count = pt.executeUpdate();
			
			System.out.println("삽입행의 갯수 = " + count);
			
			con.close();
			System.out.println("연결 해제");
			
		}catch(ClassNotFoundException e) {
		System.out.println("해당 드라이버가 발견되지 않습니다.");//?????
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
			con.close();//throws 	SQLEXCRPTION
			}catch(SQLException e) {}
		}
	
		return count;
	} //insertMember end

}