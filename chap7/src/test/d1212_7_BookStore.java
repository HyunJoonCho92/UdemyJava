package test;

class Book{
	private String title;
	private int price;
	
	Book(){
		System.out.println("Book constructor");
		this.title = "";
		this.price = 0;
	}
	
	Book(String title){
		this.title = title;
	}
	
	Book(int price){
		this.price = price;
	}
	
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

class BookMgr{
	
	private Book booklist[];
	
	
	BookMgr(Book booklist[]){
		this.booklist = booklist;
		
	}
	
	void printBooklist() {
		int length = this.booklist.length;
		
		for(int i = 0; i < length; i++)
		{
			System.out.println(this.booklist[i].getTitle());
		}
	}
	
	void printTotalPrice() {
		int length = this.booklist.length;
		int sum = 0;
		for(int i = 0; i < length; i++)
		{
			sum = sum + this.booklist[i].getPrice();
		}
		System.out.println(sum);
	}
}


public class d1212_7_BookStore {

	public static void main(String[] args) {
		Book booklist[] = new Book[5];

		Book book1 = new Book("Java Program", 25000);
		Book book2 = new Book("JSP Program", 15000);
		Book book3 = new Book("SQL Fundamentals", 30000);
		Book book4 = new Book("JDBC Program", 28000);
		Book book5 = new Book();
		book5.setTitle("EJB Program");
		book5.setPrice(34000);
		booklist[0] = book1;
		booklist[1] = book2;
		booklist[2] = book3;
		booklist[3] = book4;
		booklist[4] = book5;
		
		BookMgr mgr = new BookMgr(booklist);
		System.out.println("=== 책 목록 ===");
		mgr.printBooklist();
		System.out.println("");
		System.out.println("=== 책 가격의 총합 ===");
		mgr.printTotalPrice();
	}
}