package com.pascucci.Hexagonal.application.ports.out;

import com.pascucci.Hexagonal.application.core.domain.Worker;

public interface InsertWorkerOutputPort {

    void insert(Worker worker);
}
