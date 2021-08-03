package q3;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
	private String name;
	private List<Book> list;
	
	public BookCollection(String name) {
		this.name=name;
		list=new ArrayList<>();
	}
	
	public void addBookInCollection(Book book) {
		list.add(book);
	}
	
	public boolean hasBook(Book b) {
		for(Book book:list) {
			if(book.getTitle()==b.getTitle() && book.getAuthor()==b.getAuthor())
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder s=new StringBuilder("");
		s.append(name+ " has following books"+"\n");
		for(Book book:list)
			s.append(book.display()+"\n");
		return s.toString();
	}
	
}
