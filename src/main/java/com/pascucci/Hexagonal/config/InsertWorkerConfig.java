package com.pascucci.Hexagonal.config;

import com.pascucci.Hexagonal.adapters.out.FindVehicleByChassisAdapter;
import com.pascucci.Hexagonal.adapters.out.InsertWorkerAdapter;
import com.pascucci.Hexagonal.adapters.out.SendCpfWorkerValidationAdapter;
import com.pascucci.Hexagonal.application.core.usecase.InsertWorkerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertWorkerConfig {

    @Bean
    public InsertWorkerUseCase insertWorkerUseCase(
            FindVehicleByChassisAdapter findVehicleByChassisAdapter,
            InsertWorkerAdapter insertWorkerAdapter,
            SendCpfWorkerValidationAdapter sendCpfWorkerValidationAdapter) {
        return new InsertWorkerUseCase(findVehicleByChassisAdapter, insertWorkerAdapter, sendCpfWorkerValidationAdapter);
    }
}
