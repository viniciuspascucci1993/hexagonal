package com.pascucci.Hexagonal.application.ports.out;

import com.pascucci.Hexagonal.application.core.domain.Worker;

public interface UpdateWorkerOutputPort {

    void update(Worker worker);
}
