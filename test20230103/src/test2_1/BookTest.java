//  미완성, 미완성, 미완성, 미완성, 미완성

package test2_1;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("도서관리 jdbc 프로그램");
			System.out.println("1. 도서 입력");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 종료");
			System.out.println("번호 입력 : ");
			
			Scanner sc = new Scanner(System.in);
			
			int menu = sc.nextInt();
			
			if(menu == 3) {
				break;
			}
			else if(menu == 1) {
				new BookIsertView().input();
			}
			else if(menu == 2) {
				new TotalSelectView().input();
			}
			else {
				System.out.println("다시 입력하세요.");
			}	
		}
		
	}

}
