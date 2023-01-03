package test20230103;

public class Magazine extends Book{
	int month;

	public Magazine(String bookNo, String bookTitle, String bookAuthor, int bookYear, int bookPrice,
			String bookPublisher, int month) {
		super(bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher);
		this.month = month;
	}

	@Override
	public String toString() {
		return bookNo + " \t" + bookTitle + " \t\t" + bookAuthor + " \t" + bookYear + " \t" + bookPrice + " \t" + bookPublisher + " \t" + month;
	}
}
