package q4;

public class MainProgram {

	public static void main(String[] args) {
		BookCollection bc=new BookCollection("rk");
		bc.addBookInCollection(new Book("book3","rk3"));
		bc.addBookInCollection(new Book("Java in depth","rk5"));
		bc.addBookInCollection(new Book("book4","rk4"));
		bc.addBookInCollection(new Book("book1","rk1"));
		bc.addBookInCollection(new Book("book2","rk2"));
		System.out.println(bc.toString());
		
		if(bc.hasBook(new Book("Java in depth","rk5"))) {
			System.out.println("Book is present");
		}else {
			System.out.println("Book is not present");
		}
		
		bc.sortByTitleAndAuthor();
		
		System.out.println(bc.toString());
		
	}

}
