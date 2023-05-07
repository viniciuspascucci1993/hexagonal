package com.pascucci.Hexagonal.config;

import com.pascucci.Hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.pascucci.Hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter) {

        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
