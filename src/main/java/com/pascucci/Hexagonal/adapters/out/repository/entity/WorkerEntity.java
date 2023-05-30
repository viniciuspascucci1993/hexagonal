package com.pascucci.Hexagonal.adapters.out.repository.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "workers")
public class WorkerEntity {

    @Id
    private String id;
    private String name;
    private String email;
    private String cpf;
    private VehicleEntity vehicle;
    private Boolean isValidCpf;
    private String workerCode;
}
