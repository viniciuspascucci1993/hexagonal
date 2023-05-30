package com.pascucci.Hexagonal.application.ports.out;

public interface SendCpfWorkerForValidationOutputPort {

    void send(String cpfWorker);
}
