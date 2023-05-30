package com.pascucci.Hexagonal.adapters.out.repository.entity;

import lombok.Data;

@Data
public class VehicleEntity {

    private String id;
    private String name;
    private String vehicleModel;
    private Integer modelYear;
    private Integer manufactureYear;
    private String reindeer;
    private String chassis;
    private String vehicleType;

}
