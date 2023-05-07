package com.pascucci.Hexagonal.adapters.in.controller.mapper;

import com.pascucci.Hexagonal.adapters.in.controller.request.CustomerRequest;
import com.pascucci.Hexagonal.adapters.in.controller.response.CustomerResponse;
import com.pascucci.Hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer convertToCustomerRequest(CustomerRequest customerRequest);

    CustomerResponse convertToCustomerResponse(Customer customer);
}
