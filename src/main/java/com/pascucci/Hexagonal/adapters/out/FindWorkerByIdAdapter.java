package com.pascucci.Hexagonal.adapters.out;

import com.pascucci.Hexagonal.adapters.out.repository.WorkerRepository;
import com.pascucci.Hexagonal.adapters.out.repository.mapper.WorkerEntityMapper;
import com.pascucci.Hexagonal.application.core.domain.Worker;
import com.pascucci.Hexagonal.application.ports.out.FindWorkerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindWorkerByIdAdapter implements FindWorkerByIdOutputPort {

    @Autowired
    private WorkerRepository workerRepository;

    @Autowired
    private WorkerEntityMapper workerEntityMapper;

    @Override
    public Optional<Worker> find(String id) {
        var workerEntity = workerRepository.findById(id);
        return workerEntity.map(entity -> workerEntityMapper.toWoker(entity));
    }
}
