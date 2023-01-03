package test20230103;

import java.util.ArrayList;

public class BookEx {
	
	public static void main(String[] args) {
		
		ArrayList<Book> list = new ArrayList<>(6);
		
		Book b1 = new Book("B001", "자바프로그래밍", "홍길동", 2021, 30000, "서울출판사");
		Book b2 = new Book("B002", "데이터베이스", "이몽룡", 2020, 25000, "대한출판사");
		Book b3 = new Book("B003", "HTML/CSS", "성춘향", 2022, 18000, "민국출판사");
		Magazine m1 = new Magazine("M001", "자바 월드", "홍길동", 2021, 3000, "서울출판사", 5);
		Magazine m2 = new Magazine("M002", "웹 월드", "이몽룡", 2021, 2500, "서울출판사", 7);
		Magazine m3 = new Magazine("M003", "게임 월드", "성춘향", 2022, 1800, "서울출판사", 9);
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		System.out.println("도서번호 \t도서명 \t\t저자 \t출판년도 \t가격 \t출판사 \t발행월");
		System.out.println("------------------------------------------------------------");
		for(Object o : list) {
			System.out.println(o.toString());
		}
	}
}