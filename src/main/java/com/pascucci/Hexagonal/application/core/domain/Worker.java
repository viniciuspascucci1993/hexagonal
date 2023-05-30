package com.pascucci.Hexagonal.application.core.domain;

public class Worker {

    private String id;
    private String name;
    private String email;

    private String cpf;

    private Vehicle vehicle;
    private Boolean isValidCpf;
    private String workerCode;

    public Worker() {
        this.isValidCpf = false;
    }

    public Worker(String id, String name, String email, String cpf, Vehicle vehicle, Boolean isValidCpf, String workerCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.vehicle = vehicle;
        this.isValidCpf = isValidCpf;
        this.workerCode = workerCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Boolean getIsValidCpf() {
        return isValidCpf;
    }

    public void setIsValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }

    public String getWorkerCode() {
        return workerCode;
    }

    public void setWorkerCode(String workerCode) {
        this.workerCode = workerCode;
    }
}
