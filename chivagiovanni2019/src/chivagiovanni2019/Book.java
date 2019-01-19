package chivagiovanni2019;

public class Book {
	private String author;
	private String title;
	private int pages;
	
	public Book() {	}
	public Book(String author, String title, int pages) {
		super();
		this.author = author;
		this.title = title;
		this.pages = pages;
	}

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		
		book1.author = "Proust";
		book1.title = "A la recherche du temps perdu";
		book1.pages = 1800;
		
		book2.author = "George R.R. Martin";
		book2.title = "Le Trône de fer";
		book2.pages = 1900;
	
		System.out.println(book1.author+"'s \""+book1.title+"\" has "+book1.pages+" pages.");
	}

}
