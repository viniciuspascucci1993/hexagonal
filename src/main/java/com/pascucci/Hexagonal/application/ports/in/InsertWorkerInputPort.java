package com.pascucci.Hexagonal.application.ports.in;

import com.pascucci.Hexagonal.application.core.domain.Worker;

public interface InsertWorkerInputPort {

    void insert(Worker worker, String chassis);
}
