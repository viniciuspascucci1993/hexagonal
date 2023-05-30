package com.pascucci.Hexagonal.application.ports.in;

import com.pascucci.Hexagonal.application.core.domain.Worker;

public interface FindWorkerByIdInputPort {

    Worker find(String id);
}
