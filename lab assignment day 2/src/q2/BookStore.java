package q2;

import java.util.Scanner;

public class BookStore {
	private Book[] books;
	private int counter;
	
	public BookStore() {
		this.books=new Book[10];
		this.counter=0;
	}
	
	public void sell(String bookTitle, int numOfCopies) {
		Book currBook=null;
		int curr_index=0;
		for(Book book:books) {
			if(curr_index>=counter)
				break;
			if(book.getBookTitle().equals(bookTitle)) {
				currBook=book;
				break;
			}
			curr_index++;
		}
		if(currBook==null) {
			System.out.println("book is not present in store");
			return ;
		}
		
		if(currBook.getNumOfCopies()>numOfCopies)
			currBook.setNumOfCopies(currBook.getNumOfCopies()-numOfCopies);
		else if(currBook.getNumOfCopies()==numOfCopies) {
			while(curr_index<counter-1) {
				books[curr_index]=books[++curr_index];
			}
			books[--counter]=null;
		}
		else
			System.out.println("Unsufficient Number of copies available");
	}
	
	public void order(String isbn, int numOfCopies) {
		Book currBook=null;
		for(Book book:books) {
			if(book.getBookTitle().equals(isbn)) {
				currBook=book;
				break;
			}
		}
		if(currBook==null) {
			if(counter>=10) {
				System.out.println("this book is not in store and you can't add this book to book store because book store's size is full");
				return ;
			}
			System.out.println("Seems like this book is not present in BookStore, please Enter details to add this book in BookStore");
			System.out.println("book title, author, isbn, number of copies(space separated)");
			Scanner sc=new Scanner(System.in);
			String[] str=sc.nextLine().split(" ");
			books[counter]=new Book(str[0],str[1],str[2],Integer.parseInt(str[3]));
			counter++;
			sc.close();
		}
		else
			currBook.setNumOfCopies(currBook.getNumOfCopies()+numOfCopies);
	}

	public int getCounter() {
		return counter;
	}

	public void display() {
		for(Book book:books) {
			book.display();
		}
	}
	
}
