package com.pascucci.Hexagonal.adapters.out.client.mapper;

import com.pascucci.Hexagonal.adapters.out.client.response.AddressResponse;
import com.pascucci.Hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address convertToAddress(AddressResponse addressResponse);
}
