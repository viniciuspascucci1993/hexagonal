package com.pascucci.Hexagonal.adapters.out.client;

import com.pascucci.Hexagonal.adapters.out.client.response.VehicleResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindVehicleByChassisClient",
        url = "${pascucci.client.vehicle.url}"
)
public interface FindVehicleByChassisClient {

    @GetMapping("/{chassis}")
    VehicleResponse find(@PathVariable("chassis") String chassis);
}
