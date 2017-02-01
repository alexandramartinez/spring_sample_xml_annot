package com.martinez.repository;

import com.martinez.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
