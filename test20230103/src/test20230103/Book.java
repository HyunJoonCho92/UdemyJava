package test20230103;

public class Book {
	String bookNo;
	String bookTitle;
	String bookAuthor;
	int bookYear;
	int bookPrice;
	String bookPublisher;
	
	public Book(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice, String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookYear = bookYear;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}

	@Override
	public String toString() {
		return bookNo + " \t" + bookTitle + " \t" + bookAuthor + " \t" + bookYear + " \t" + bookPrice + " \t" + bookPublisher;
	}
	
	
	
	
	
	
}