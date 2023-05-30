package com.pascucci.Hexagonal.config;

import com.pascucci.Hexagonal.adapters.out.DeleteWorkerByIdAdapter;
import com.pascucci.Hexagonal.application.core.usecase.DeleteWorkerByIdUseCase;
import com.pascucci.Hexagonal.application.ports.in.FindWorkerByIdInputPort;
import com.pascucci.Hexagonal.application.ports.out.DeleteWorkerByIdOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteWorkerByIdConfig {

    @Bean
    public DeleteWorkerByIdUseCase deleteWorkerByIdUseCase(
            FindWorkerByIdInputPort findWorkerByIdInputPort,
            DeleteWorkerByIdAdapter deleteWorkerByIdAdapter) {

        return new DeleteWorkerByIdUseCase(findWorkerByIdInputPort, deleteWorkerByIdAdapter);
    }
}
