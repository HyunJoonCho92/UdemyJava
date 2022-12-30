package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class MonthEmployee {
	
	ArrayList getEmployees() {
		
		ArrayList result = new ArrayList();
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			// 0. jdbc driver 호출 - jdk 비포함
			Class.forName(ConnectionInform.DRIVER_CLASS);
			
			// 1. db 연결
			con = DriverManager.getConnection
					(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME, ConnectionInform.PASSWORD);
			System.out.println("연결 성공");
			System.out.println(con.getAutoCommit());
			
//		    * 키보드 입력
			Scanner sc = new Scanner(System.in);
			System.out.println("제외할 월 : ");
			int num = sc.nextInt();
//			
//			제외할 월 : 3
//			01-12 사이 값 입력시 월별 입사자 총급여 조회
//			입사월 급여총합
//			01    xxx
//			02    xxx
//			04    xxx
//			....
//			12    xxx
			String sql = "SELECT MONTH(hire_date) AS h, SUM(salary) " +
						 "FROM employees " +
						 "GROUP BY MONTH(hire_date) " +
						 "HAVING h != ?";
			PreparedStatement pt = con.prepareStatement(sql);
			pt.setInt(1, num);
			rs = pt.executeQuery();
			
			System.out.println("입사월 \t급여총합");
			while(rs.next()) {
				String hire_date = rs.getString("h");
				String salary = rs.getString("SUM(salary)");
//				System.out.printf("%s   %s\n", hire_date, salary);
				
				String temp = hire_date + "\t" + salary;
				
				result.add(temp);
			}
			
			//System.out.println("연결 해제 성공");
			

			
		}catch(ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			rs.close();	
			//pt.close();	
			con.close();//throws 	SQLEXCRPTION
			}catch(SQLException e) {}
		}
		return result;
		
		
	}

	public static void main(String[] args){
		
		
//		MonthEmployee me = new MonthEmployee();
//		ArrayList al = me.getEmployees();
		
		ArrayList arr = new MonthEmployee().getEmployees();
		
		for(Object i : arr) {
			System.out.println(i);
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("제외할 월 : ");
//		int num = sc.nextInt();
	
		
		
		

		

		
	}
}