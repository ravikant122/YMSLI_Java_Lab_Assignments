package com.customer.controller;

import java.util.Date;

import com.customer.exceptions.DaoException;
import com.customer.exceptions.ResourceNotFoundException;
import com.customer.model.Customer;
import com.customer.service.CustomerService;
import com.customer.service.CustomerServiceImpl;

public class Controller {

	public static void main(String[] args) {
		
		CustomerService cs=new CustomerServiceImpl();

		Customer customer=null;
		
		try {
			customer = cs.addCustomer(new Customer("rk2","sc2",98989989,new Date()));
			System.out.println(customer.getName());
		} catch(DaoException e) {
			e.printStackTrace();
		}
		
		try {
			customer = cs.getCustomerById(2);
			System.out.println(customer.getName());
		} catch(ResourceNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
