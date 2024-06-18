package org.example.baithuchanh_hibernate.service;


import org.example.baithuchanh_hibernate.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void remove(int id);
}
