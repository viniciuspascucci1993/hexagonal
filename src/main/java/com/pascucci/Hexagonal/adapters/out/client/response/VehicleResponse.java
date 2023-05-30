package com.pascucci.Hexagonal.adapters.out.client.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleResponse {

    private String id;
    private String name;
    private String vehicleModel;
    private Integer modelYear;
    private Integer manufactureYear;
    private String reindeer;
    private String chassis;
    private String vehicleType;
}
