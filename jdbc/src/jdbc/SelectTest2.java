package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest2 {
	
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
		//0. jdbc driver 호출-jdk비포함
		Class.forName(ConnectionInform.DRIVER_CLASS);
		//1.db 연결
		con = DriverManager.getConnection
		(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
		System.out.println("연결 성공");
		System.out.println(con.getAutoCommit());
		
		
		
//		// product 테이블
//		String sql= "SELECT * FROM product WHERE price >= 1000000";//107레코드*11컬럼
//		rs = st.executeQuery(sql);
//		System.out.println("삽입행의 갯수=" + rs); //rs.toString()
//		int line= 0;
//		while(rs.next()) {
//			++line;
//			int id = rs.getInt("p_code"); //rs.getInt(1);
//			String name = rs.getString("p_name");
//			double price = rs.getDouble("price");
//			int balance = rs.getInt("balance");
//			System.out.printf
//			("%d 코드:%d 이름:%s 가격:%.2f 수량:%d \n", line , id, name, price, balance);
//		}
		
		
		// users 테이블에서 용산구 주소를 가진 사용자 아이디, 주소 조회
		
		String sql= "SELECT user_id, user_address FROM users WHERE user_address LIKE ?";//107레코드*11컬럼
		
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setString(1, "%" + "용산구" + "%");
		
		rs = pt.executeQuery();
		
		//st = con.createStatement();//sql저장-전송객체
//		st = con.prepareStatement(sql);
		//String sql= "SELECT user_id, user_address FROM users WHERE user_address LIKE '%용산구%'";//107레코드*11컬럼
//		rs = st.executeQuery(sql);
//		System.out.println("삽입행의 갯수=" + rs); //rs.toString()
		
		int line= 0;
		while(rs.next()) {
			++line;
			String user_id = rs.getString("user_id");
			String user_address = rs.getString("user_address");
			System.out.printf
			("%d 아이디:%s 주소:%s\n", line , user_id, user_address);
		}
		
		
		//con.close();
		System.out.println("연결 해제 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다.");//?????
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			rs.close();
			con.close();//throws 	SQLEXCRPTION
			}catch(SQLException e) {}
		}

	}

}
