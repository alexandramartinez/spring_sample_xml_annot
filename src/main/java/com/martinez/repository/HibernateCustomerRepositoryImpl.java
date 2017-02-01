package com.martinez.repository;

import com.martinez.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Alex");
        customer.setLastName("Martinez");
        customers.add(customer);

        return customers;
    }
}
