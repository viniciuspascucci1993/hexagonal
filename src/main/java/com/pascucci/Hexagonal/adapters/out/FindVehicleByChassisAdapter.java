package com.pascucci.Hexagonal.adapters.out;

import com.pascucci.Hexagonal.adapters.out.client.FindVehicleByChassisClient;
import com.pascucci.Hexagonal.adapters.out.client.mapper.VehicleResponseMapper;
import com.pascucci.Hexagonal.application.core.domain.Vehicle;
import com.pascucci.Hexagonal.application.ports.out.FindVehicleByChassisOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindVehicleByChassisAdapter implements FindVehicleByChassisOutputPort {

    @Autowired
    private FindVehicleByChassisClient findVehicleByChassisClient;

    @Autowired
    private VehicleResponseMapper vehicleResponseMapper;

    @Override
    public Vehicle find(String chassis) {
        var vehicleResponse = findVehicleByChassisClient.find(chassis);
        return vehicleResponseMapper.toVehicle(vehicleResponse);
    }
}
