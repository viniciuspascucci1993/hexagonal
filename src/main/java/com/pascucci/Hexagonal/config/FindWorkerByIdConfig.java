package com.pascucci.Hexagonal.config;

import com.pascucci.Hexagonal.adapters.out.FindWorkerByIdAdapter;
import com.pascucci.Hexagonal.application.core.usecase.FindWorkerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindWorkerByIdConfig {

    @Bean
    public FindWorkerByIdUseCase findWorkerByIdUseCase(
            FindWorkerByIdAdapter findWorkerByIdAdapter) {
        return new FindWorkerByIdUseCase(findWorkerByIdAdapter);
    }
}
