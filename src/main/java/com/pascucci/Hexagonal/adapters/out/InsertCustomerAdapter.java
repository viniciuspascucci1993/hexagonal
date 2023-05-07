package com.pascucci.Hexagonal.adapters.out;

import com.pascucci.Hexagonal.adapters.out.repository.CustomerRepository;
import com.pascucci.Hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.pascucci.Hexagonal.application.core.domain.Customer;
import com.pascucci.Hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.convertToCustomer(customer);
        customerRepository.save(customerEntity);
    }
}
