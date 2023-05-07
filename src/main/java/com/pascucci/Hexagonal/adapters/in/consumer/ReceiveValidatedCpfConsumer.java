package com.pascucci.Hexagonal.adapters.in.consumer;

import com.pascucci.Hexagonal.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.pascucci.Hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.pascucci.Hexagonal.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "pascucci")
    public void receive(CustomerMessage customerMessage) {
        var customer = customerMessageMapper.convertToCustomerMessage(customerMessage);
         updateCustomerInputPort.update(customer, customerMessage.getZipCode());
    }
}
