package com.bookStore.service;

import java.util.List;

import com.bookStore.dao.BookDao;
import com.bookStore.dao.BookDaoImpJdbc;
import com.bookStore.entities.Book;

public class BookServiceImp implements BookService{
	
	BookDao bookDao=new BookDaoImpJdbc();
	
	@Override
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookById(int id) {
		return bookDao.getBookById(id);
	}

	@Override
	public Book addBook(Book book) {
		bookDao.addBook(book);
		return null;
	}

	@Override
	public void deleteBook(int id) {
		bookDao.deleteBook(id);
	}

	@Override
	public void updateBook(int id, Book book) {
		bookDao.updateBook(id, book);
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

}
