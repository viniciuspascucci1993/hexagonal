package com.pascucci.Hexagonal.adapters.out;

import com.pascucci.Hexagonal.application.ports.out.SendCpfWorkerForValidationOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class SendCpfWorkerValidationAdapter implements SendCpfWorkerForValidationOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void send(String cpfWorker) {
        kafkaTemplate.send("tp-cpf-worker-validation", cpfWorker);
    }
}
