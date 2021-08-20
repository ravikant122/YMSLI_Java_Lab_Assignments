package com.customer.service;

import com.customer.model.Customer;

public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public Customer getCustomerById(int id);
}
