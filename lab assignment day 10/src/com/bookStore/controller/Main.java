package com.bookStore.controller;


import com.bookStore.entities.Book;
import com.bookStore.service.BookService;
import com.bookStore.service.BookServiceImp;

public class Main {
	public static void main(String[] args) {
		
		BookService bookService=new BookServiceImp();
		for(Book book:bookService.getAllBooks())
			System.out.println(book.toString());
		
	}
}
