package com.pascucci.Hexagonal.adapters.out;

import com.pascucci.Hexagonal.adapters.out.repository.WorkerRepository;
import com.pascucci.Hexagonal.adapters.out.repository.mapper.WorkerEntityMapper;
import com.pascucci.Hexagonal.application.core.domain.Worker;
import com.pascucci.Hexagonal.application.ports.out.UpdateWorkerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateWorkerAdapter implements UpdateWorkerOutputPort {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private WorkerEntityMapper workerEntityMapper;

    @Override
    public void update(Worker worker) {
        var workerEntity = workerEntityMapper.toWorkerEntity(worker);
        workerRepository.save(workerEntity);
    }
}
