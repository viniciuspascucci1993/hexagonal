package com.pascucci.Hexagonal.adapters.out.client.mapper;

import com.pascucci.Hexagonal.adapters.out.client.response.VehicleResponse;
import com.pascucci.Hexagonal.application.core.domain.Vehicle;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface VehicleResponseMapper {

    Vehicle toVehicle(VehicleResponse vehicleResponse);

}
