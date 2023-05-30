package com.pascucci.Hexagonal.adapters.in.controller.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class WorkerRequest {

    @NotBlank(message = "Please provide a name!")
    private String name;

    @Email(message = "Please provide an e-mail address valid!")
    @NotBlank(message = "Please provide an e-mail!")
    private String email;

    @NotBlank(message = "Please provide a cpf!")
    private String cpf;

    @NotBlank(message = "Please provide a worker code!")
    private String chassis;

}
