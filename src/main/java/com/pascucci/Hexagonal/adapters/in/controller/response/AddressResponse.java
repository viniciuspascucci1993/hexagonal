package com.pascucci.Hexagonal.adapters.in.controller.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {

    private String street;
    private String city;
    private String state;
}
