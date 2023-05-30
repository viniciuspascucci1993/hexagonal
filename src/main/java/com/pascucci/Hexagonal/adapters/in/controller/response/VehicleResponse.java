package com.pascucci.Hexagonal.adapters.in.controller.response;

import lombok.Data;

@Data
public class VehicleResponse {

    private String name;
    private String vehicleModel;
    private Integer modelYear;
    private Integer manufactureYear;
    private String reindeer;
    private String chassis;
    private String vehicleType;
}
