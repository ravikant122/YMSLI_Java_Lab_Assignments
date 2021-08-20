package com.customer.service;

import com.customer.dao.CustomerDao;
import com.customer.dao.CustomerDaoImpl;
import com.customer.model.Customer;

public class CustomerServiceImpl implements CustomerService{
	
	CustomerDao customerDao=new CustomerDaoImpl();

	@Override
	public Customer addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

}
