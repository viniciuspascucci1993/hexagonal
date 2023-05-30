package com.pascucci.Hexagonal.application.ports.in;

import com.pascucci.Hexagonal.application.core.domain.Worker;

public interface UpdateWorkerInputPort {

    void update(Worker worker, String chassis);
}
