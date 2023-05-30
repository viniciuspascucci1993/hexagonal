package com.pascucci.Hexagonal.application.core.usecase;

import com.pascucci.Hexagonal.application.ports.in.DeleteWorkerByIdInputPort;
import com.pascucci.Hexagonal.application.ports.in.FindWorkerByIdInputPort;
import com.pascucci.Hexagonal.application.ports.out.DeleteWorkerByIdOutputPort;

public class DeleteWorkerByIdUseCase implements DeleteWorkerByIdInputPort {

    private final FindWorkerByIdInputPort findWorkerByIdInputPort;

    private final DeleteWorkerByIdOutputPort deleteWorkerByIdOutputPort;

    public DeleteWorkerByIdUseCase(FindWorkerByIdInputPort findWorkerByIdInputPort,
                                   DeleteWorkerByIdOutputPort deleteWorkerByIdOutputPort) {
        this.findWorkerByIdInputPort = findWorkerByIdInputPort;
        this.deleteWorkerByIdOutputPort = deleteWorkerByIdOutputPort;
    }

    @Override
    public void delete(String id) {
        findWorkerByIdInputPort.find(id);
        deleteWorkerByIdOutputPort.delete(id);
    }
}
