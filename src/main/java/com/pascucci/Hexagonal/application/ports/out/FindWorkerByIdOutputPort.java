package com.pascucci.Hexagonal.application.ports.out;

import com.pascucci.Hexagonal.application.core.domain.Worker;

import java.util.Optional;

public interface FindWorkerByIdOutputPort {

    Optional<Worker> find(String id);
}
