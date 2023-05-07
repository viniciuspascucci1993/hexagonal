package com.pascucci.Hexagonal.application.core.usecase;

import com.pascucci.Hexagonal.application.core.domain.Customer;
import com.pascucci.Hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.pascucci.Hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id) {
        return findCustomerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Customer Not Found"));
    }
}
