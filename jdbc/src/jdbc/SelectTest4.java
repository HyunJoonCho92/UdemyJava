package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest4 {
	
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
		
		st = con.createStatement();//sql저장-전송객체
		
		// employees 테이블에서 사원명 입력
		// 사원명 부서명 도시명
		// 만약 부서명, 도시명 null인 경우는 부서명 - 부서이동중, 도시명 - 이사중 출력
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("사원명 입력 : ");
		String name = key.next();
		
		String sql = "SELECT e.first_name, IFNULL(d.department_name, '부서이동중') as department_name, IFNULL(l.city, '이사중') as city " + 
					 "FROM employees e " +
					 "LEFT JOIN departments d ON e.department_id = d.department_id " +
					 "LEFT JOIN locations l ON d.location_id = l.location_id " +
					 "WHERE first_name = '" + name + "';";
		
		rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String first_name = rs.getString("e.first_name");
			String department_name = rs.getString("department_name");
			String city = rs.getString("city");
			
			System.out.printf
			(" 이름:%s 부서명:%s 도시명:%s\n", first_name, department_name, city);
		}
		
		//con.close();
		System.out.println("연결 해제 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다.");//?????
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
			con.close();//throws 	SQLEXCRPTION
			}catch(SQLException e) {}
		}

	}

}
