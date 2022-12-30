package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest {

	public static void main(String[] args) {
		
		Connection con = null;
		try {
			//0. jdbc driver 호출 - jdk비포함
			Class.forName(ConnectionInform.DRIVER_CLASS);
			
			//1. db 연결
			con = DriverManager.getConnection
			(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			System.out.println(con.getAutoCommit());
			
			Statement st = con.createStatement();
			
			//////////////////////////////////////////////////////////////////////
//			//emp_copy에 "100 길동 홍 1000 now() 50" 넣기
//			String sql = "INSERT INTO emp_copy VALUES(400, '길동', '홍', 1000, now(), 50);";
//			String sql = "INSERT INTO product VALUES(2, \"스마트폰케이스\", 10000, 10);";
			
			
			//////////////////////////////////////////////////////////////////////
			// INSERT
//			Scanner key = new Scanner(System.in);
//			System.out.println("상품명 : ");
//			String p_name = key.nextLine();
//			System.out.println("가격 : ");
//			int price = key.nextInt();
//			System.out.println("수량 : ");
//			int balance = key.nextInt();
//			
//			
//			String sql = "INSERT INTO product(p_name, price, balance)"
//					+ "VALUES('" + p_name + "', " + price + ", " + balance + ")";
//			
//			int rowcount = st.executeUpdate(sql);
//			System.out.println("삽입행의 갯수 = " + rowcount);

			
			///////////////////////////////////////////////////////////////////////
			// UPDATE 테이블명 SET 변경컬럼명=변경값 WHERE 변경조건식
//			Scanner key = new Scanner(System.in);
//			System.out.println("수정 사번 : ");
//			int employee_id = key.nextInt();
//			System.out.println("수정 이름 : ");
//			String name = key.next();
//			System.out.println("인상할 급여 : ");
//			double salary = key.nextDouble();
//			
//			String first_name = "'" + name.substring(1) + "'";
//			String last_name = "'" + name.substring(0,1) + "'";
//			
//			String sql = "UPDATE EMP_COPY SET first_name = " + first_name + ", last_name = " + last_name
//					+ ", salary = salary + " + salary + " WHERE employee_id = " + employee_id;
//			
//			int rowcount = st.executeUpdate(sql);
//			System.out.println("삽입행의 갯수 = " + rowcount);

			
			///////////////////////////////////////////////////////////////////////
			//SELECT
			String sql = "SELECT employee_id, first_name, last_name, salary, hire_date FROM employees";
			ResultSet rs = st.executeQuery(sql);
			System.out.println("삽입행의 갯수 = " + rs);
			
			int line = 0;
			while(rs.next()) {
				++line;
				int id = rs.getInt(1);
				String name = rs.getString(2) + "-" + rs.getString(3);
				double salary = rs.getDouble("salary");
				java.sql.Date d = rs.getDate("hire_date");
				String d2 = rs.getString("hire_date");
				System.out.printf("%d 사번: %d 이름: %s 급여: %f 입사일: %s \n",line,id,name,salary,d2);
			}
			
			con.close();
			System.out.println("연결 해제 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지않습니다.");
		}catch(SQLException e) {
			System.out.println("연결 정보를 확인하세요.");
			e.printStackTrace();
		}finally {
			try {
				con.close();
			}catch(SQLException e) {
				
			}
		}
	}
}