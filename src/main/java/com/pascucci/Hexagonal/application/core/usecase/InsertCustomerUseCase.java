package com.pascucci.Hexagonal.application.core.usecase;

import com.pascucci.Hexagonal.application.core.domain.Customer;
import com.pascucci.Hexagonal.application.ports.in.InsertCustomerInputPort;
import com.pascucci.Hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.pascucci.Hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.pascucci.Hexagonal.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort,
                                 SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);

        // enviar para uma fila no kafka
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
