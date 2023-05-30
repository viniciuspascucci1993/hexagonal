package com.pascucci.Hexagonal.application.core.domain;

public class Vehicle {
    private String name;
    private String vehicleModel;
    private Integer modelYear;
    private Integer manufactureYear;
    private String reindeer;
    private String chassis;
    private String vehicleType;

    public Vehicle() { }

    public Vehicle(String name, String vehicleModel, Integer modelYear, Integer manufactureYear, String reindeer, String chassis, String vehicleType) {
        this.name = name;
        this.vehicleModel = vehicleModel;
        this.modelYear = modelYear;
        this.manufactureYear = manufactureYear;
        this.reindeer = reindeer;
        this.chassis = chassis;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Integer manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getReindeer() {
        return reindeer;
    }

    public void setReindeer(String reindeer) {
        this.reindeer = reindeer;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}
