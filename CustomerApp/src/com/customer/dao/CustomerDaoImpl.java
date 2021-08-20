package com.customer.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.customer.exceptions.DaoException;
import com.customer.exceptions.ResourceNotFoundException;
import com.customer.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private Connection connection;
	
	public CustomerDaoImpl() {
		connection=JDBCConnectionFactory.getConnection();
	}
	
	@Override
	public Customer addCustomer(Customer customer) {
		try {
			
			PreparedStatement pstmt=connection.prepareStatement("insert into customer(name,address,phoneno,dob"
														+ ") values(?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getAddress());
			pstmt.setInt(3, customer.getPhoneNo());
			pstmt.setDate(4, new Date(customer.getDob().getTime()));

			pstmt.executeUpdate();

			ResultSet rs=pstmt.getGeneratedKeys();
			if(rs.next())
				customer.setId(rs.getInt(1));
		} catch (SQLException e) {
			throw new DaoException(e.toString());
		}
		return customer;
	}
	
	@Override
	public Customer getCustomerById(int id) {
		Customer customer = null;
	    try {
	        PreparedStatement pstmt = connection.prepareStatement("select * from customer where id=?");
	        pstmt.setInt(1, id);
	
	        ResultSet rs = pstmt.executeQuery();
	        if (rs.next()) {
	        	customer = new Customer(rs.getString("name"), rs.getString("address"),
	        							rs.getInt("phoneno"),rs.getDate("dob"));
	        } else {
	            throw new ResourceNotFoundException("book with id = " + id + " is not found");
	        }
	    } catch (SQLException e) {
	        throw new DaoException(e.toString());
	    }
	    return customer;
	}
}
