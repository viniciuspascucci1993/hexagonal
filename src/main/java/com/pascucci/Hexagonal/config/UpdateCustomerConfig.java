package com.pascucci.Hexagonal.config;

import com.pascucci.Hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.pascucci.Hexagonal.application.core.usecase.UpdateCustomerUseCase;
import com.pascucci.Hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.pascucci.Hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            UpdateCustomerOutputPort updateCustomerOutputPort) {

        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeOutputPort,
                updateCustomerOutputPort);
    }
}
