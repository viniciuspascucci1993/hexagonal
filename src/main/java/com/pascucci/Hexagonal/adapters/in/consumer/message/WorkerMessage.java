package com.pascucci.Hexagonal.adapters.in.consumer.message;

import com.pascucci.Hexagonal.application.core.domain.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkerMessage {

    private String id;
    private String name;
    private String email;
    private String cpf;
    private Boolean isValidCpf;
    private String chassis;
}
