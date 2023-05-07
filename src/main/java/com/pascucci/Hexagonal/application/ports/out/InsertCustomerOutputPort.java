package com.pascucci.Hexagonal.application.ports.out;

import com.pascucci.Hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
