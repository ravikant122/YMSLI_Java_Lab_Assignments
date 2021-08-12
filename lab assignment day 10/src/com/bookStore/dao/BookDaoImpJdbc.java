package com.bookStore.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bookStore.dao.factory.DBConnectionFactory;
import com.bookStore.entities.Book;
import com.bookStore.exceptions.DaoException;
import com.bookStore.exceptions.ResourceNotFoundException;
public class BookDaoImpJdbc implements BookDao{

	private static final String INSERT = "insert into books(isbn,title,author,price,pubDate) values(?,?,?,?,?";
	private Connection connection;
	
	public BookDaoImpJdbc() {
		connection=DBConnectionFactory.getConnection();
	}
	
	@Override
	public List<Book> getAllBooks() {
		List<Book> books=new ArrayList<Book>();
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from books");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
				books.add(new Book(rs.getString("isbn"),
						rs.getString("title"),
						rs.getString("author"),
						rs.getDouble("price"),
						rs.getDate("pubDate")));
		} catch(SQLException e) {
			throw new DaoException(e.toString());
		}
		
		return books;
	}

	@Override
	public Book getBookById(int id) {
		Book book=null;
		try {
			PreparedStatement pstmt=connection.prepareStatement("select * from books where id = ?");
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				book=new Book(rs.getString("isbn"),
						rs.getString("title"),
						rs.getString("author"),
						rs.getDouble("price"),
						rs.getDate("pubDate"));
			}
		} catch (SQLException e) {
			throw new DaoException(e.toString());
		}
		return book;
	}

	@Override
	public Book addBook(Book book) {
		try {
			
			PreparedStatement pstmt=connection.prepareStatement(INSERT,Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, book.getIsbn());
			pstmt.setString(2, book.getTitle());
			pstmt.setString(3, book.getAuthor());
			pstmt.setDouble(4, book.getPrice());
			pstmt.setDate(5, new Date(book.getPubDate().getTime()));
			// jdbc only support java.sql.Date 

			pstmt.executeUpdate();

			ResultSet rs=pstmt.getGeneratedKeys();
			if(rs.next())
				book.setId(rs.getInt(1));
		} catch (SQLException e) {
			throw new DaoException(e.toString());
		}
		return book;
	}

	@Override
	public void deleteBook(int id) {
		try {	
			PreparedStatement pstmt = connection.prepareStatement("delete from books where id=?");
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new DaoException(e.toString());
		}
		
	}

	@Override
	public void updateBook(int id, Book book) {
	    try {
            String UPDATE_BOOK_QUERY = "update books set price=? where id=?";
            PreparedStatement pstmt = connection.prepareStatement(UPDATE_BOOK_QUERY);
            pstmt.setInt(1, id);
            pstmt.setDouble(1, book.getPrice());

            pstmt.executeUpdate();

        } catch (SQLException ex) {
            throw new DaoException(ex.toString());
        }

	}

	 

    @Override
    public Book getBookByIsbn(String isbn) {
        Book book = null;
        try {
            PreparedStatement pstmt = connection.prepareStatement("select * from books where isbn=?");
            pstmt.setString(1, isbn);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                book = new Book(rs.getString("isbn"), rs.getString("title"), rs.getString("author"),
                        rs.getDouble("price"), rs.getDate("pubDate"));
            } else {
                throw new ResourceNotFoundException("book with isbn :=" + isbn + " is not found");
            }
        } catch (SQLException e) {
            throw new DaoException(e.toString());
        }
        return book;
    }
 
}
