package q4;

public class Book implements Comparable<Book> {
	private String title;
	private String author;
	
	public Book(String title,String author) {
		this.title=title;
		this.author=author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String display() {
		return "Book name = "+title+" & author = "+author;
	}

	@Override
	public int compareTo(Book b) {
		int val=this.getTitle().compareTo(b.getTitle());
		if(val==0) {
			val=this.getAuthor().compareTo(b.getAuthor());
		}
		return val;
	}
}
