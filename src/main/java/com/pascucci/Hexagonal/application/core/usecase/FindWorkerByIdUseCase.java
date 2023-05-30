package com.pascucci.Hexagonal.application.core.usecase;

import com.pascucci.Hexagonal.application.core.domain.Worker;
import com.pascucci.Hexagonal.application.ports.in.FindWorkerByIdInputPort;
import com.pascucci.Hexagonal.application.ports.out.FindWorkerByIdOutputPort;

public class FindWorkerByIdUseCase implements FindWorkerByIdInputPort {

    private final FindWorkerByIdOutputPort findWorkerByIdOutputPort;

    public FindWorkerByIdUseCase(FindWorkerByIdOutputPort findWorkerByIdOutputPort) {
        this.findWorkerByIdOutputPort = findWorkerByIdOutputPort;
    }
    @Override
    public Worker find(String id) {
        return findWorkerByIdOutputPort.find(id)
                .orElseThrow(() -> new RuntimeException("Worker not Found!"));
    }
}
