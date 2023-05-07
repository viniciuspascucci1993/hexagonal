package com.pascucci.Hexagonal.application.ports.in;

import com.pascucci.Hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
