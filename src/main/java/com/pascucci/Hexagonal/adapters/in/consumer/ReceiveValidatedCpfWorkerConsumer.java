package com.pascucci.Hexagonal.adapters.in.consumer;

import com.pascucci.Hexagonal.adapters.in.consumer.mapper.WorkerMessageMapper;
import com.pascucci.Hexagonal.adapters.in.consumer.message.WorkerMessage;
import com.pascucci.Hexagonal.application.ports.in.UpdateWorkerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfWorkerConsumer {

    @Autowired
    private UpdateWorkerInputPort updateWorkerInputPort;

    @Autowired
    private WorkerMessageMapper workerMessageMapper;

    @KafkaListener(topics = "tp-cpf-worker-validated", groupId = "pascucci")
    public void receive(WorkerMessage workerMessage) {
        var worker = workerMessageMapper.toWorker(workerMessage);
        updateWorkerInputPort.update(worker, workerMessage.getChassis());
    }
}
