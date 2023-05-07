package com.pascucci.Hexagonal.adapters.in.consumer.mapper;

import com.pascucci.Hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.pascucci.Hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer convertToCustomerMessage(CustomerMessage customerMessage);
}
