package hibernatePrgrm;

public class BookPojo {

	private int book_id;
	private String name;
	private String author;
	private double price;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public BookPojo(int book_id, String name, String author, double price) {
		super();
		this.book_id = book_id;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	public BookPojo() {
		super();
	}
	
}
