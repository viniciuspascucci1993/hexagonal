package com.pascucci.Hexagonal.adapters.out.repository.mapper;

import com.pascucci.Hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.pascucci.Hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity convertToCustomer(Customer customer);

    Customer convertCustomer(CustomerEntity customerEntity);
}
