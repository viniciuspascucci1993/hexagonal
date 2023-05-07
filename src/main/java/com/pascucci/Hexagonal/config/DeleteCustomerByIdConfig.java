package com.pascucci.Hexagonal.config;

import com.pascucci.Hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.pascucci.Hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.pascucci.Hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter) {

        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
