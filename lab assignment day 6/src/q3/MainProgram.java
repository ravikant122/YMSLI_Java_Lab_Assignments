package q3;

public class MainProgram {

	public static void main(String[] args) {
		BookCollection bc=new BookCollection("rk");
		bc.addBookInCollection(new Book("book1","rk1"));
		bc.addBookInCollection(new Book("book2","rk2"));
		bc.addBookInCollection(new Book("book3","rk3"));
		bc.addBookInCollection(new Book("book4","rk4"));
		bc.addBookInCollection(new Book("book5","rk5"));
		
		System.out.println(bc.toString());
		
		if(bc.hasBook(new Book("book5","rk5"))) {
			System.out.println("book is present");
		}else {
			System.out.println("book is not present");
		}

	}

}
