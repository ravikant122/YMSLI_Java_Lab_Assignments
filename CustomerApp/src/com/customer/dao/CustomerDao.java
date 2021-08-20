package com.customer.dao;

import com.customer.model.Customer;

public interface CustomerDao {
	
	public Customer addCustomer(Customer customer);
	public Customer getCustomerById(int id);
	
}
