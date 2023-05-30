package com.pascucci.Hexagonal.config;

import com.pascucci.Hexagonal.adapters.out.FindVehicleByChassisAdapter;
import com.pascucci.Hexagonal.adapters.out.FindWorkerByIdAdapter;
import com.pascucci.Hexagonal.adapters.out.UpdateWorkerAdapter;
import com.pascucci.Hexagonal.application.core.usecase.FindWorkerByIdUseCase;
import com.pascucci.Hexagonal.application.core.usecase.UpdateWorkerUseCase;
import com.pascucci.Hexagonal.application.ports.in.FindWorkerByIdInputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateWorkerConfig {

    @Bean
    public UpdateWorkerUseCase updateWorkerUseCase(
          FindWorkerByIdUseCase findWorkerByIdUseCase,
          FindVehicleByChassisAdapter findVehicleByChassisAdapter,
          UpdateWorkerAdapter updateWorkerAdapter) {

        return new UpdateWorkerUseCase(findWorkerByIdUseCase, findVehicleByChassisAdapter, updateWorkerAdapter);
    }
}
