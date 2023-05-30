package com.pascucci.Hexagonal.adapters.in.controller.response;

import lombok.Data;

@Data
public class WorkerResponse {

    private String name;
    private String email;
    private String cpf;
    private VehicleResponse vehicle;
    private Boolean isValidCpf;
    private String workerCode;

}
