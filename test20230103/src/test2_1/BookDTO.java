//  미완성, 미완성, 미완성, 미완성, 미완성

package test2_1;

public class BookDTO {
	
	String bookNo;
	String bookTitle;
	String bookAuthor;
	String bookTime;
	int bookPrice;
	String bookPublisher;
	public BookDTO() {
		super();
		this.
	}
	public BookDTO(String bookNo, String bookTitle, String bookAuthor, String bookTime, int bookPrice,
			String bookPublisher) {
		super();
		this.bookNo = bookNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookTime = bookTime;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
	}
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookTime() {
		return bookTime;
	}
	public void setBookTime(String bookTime) {
		this.bookTime = bookTime;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	@Override
	public String toString() {
		return "BookDTO [bookNo=" + bookNo + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookTime="
				+ bookTime + ", bookPrice=" + bookPrice + ", bookPublisher=" + bookPublisher + "]";
	}
	
	
	
	
}
