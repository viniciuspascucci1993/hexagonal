package com.pascucci.Hexagonal.adapters.out;

import com.pascucci.Hexagonal.adapters.out.repository.WorkerRepository;
import com.pascucci.Hexagonal.application.ports.out.DeleteWorkerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteWorkerByIdAdapter implements DeleteWorkerByIdOutputPort {

    @Autowired
    private WorkerRepository workerRepository;
    @Override
    public void delete(String id) {
        workerRepository.deleteById(id);
    }
}
