package com.pascucci.Hexagonal.config;

import com.pascucci.Hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.pascucci.Hexagonal.adapters.out.InsertCustomerAdapter;
import com.pascucci.Hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.pascucci.Hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter) {

        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter,
                sendCpfForValidationAdapter);
    }
}
