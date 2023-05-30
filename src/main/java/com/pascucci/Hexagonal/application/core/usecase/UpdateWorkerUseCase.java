package com.pascucci.Hexagonal.application.core.usecase;

import com.pascucci.Hexagonal.application.core.domain.Worker;
import com.pascucci.Hexagonal.application.ports.in.FindWorkerByIdInputPort;
import com.pascucci.Hexagonal.application.ports.in.UpdateWorkerInputPort;
import com.pascucci.Hexagonal.application.ports.out.FindVehicleByChassisOutputPort;
import com.pascucci.Hexagonal.application.ports.out.UpdateWorkerOutputPort;

public class UpdateWorkerUseCase implements UpdateWorkerInputPort {

    private final FindWorkerByIdInputPort findWorkerByIdInputPort;

    private final FindVehicleByChassisOutputPort findVehicleByChassisOutputPort;

    private final UpdateWorkerOutputPort updateWorkerOutputPort;

    public UpdateWorkerUseCase(FindWorkerByIdInputPort findWorkerByIdInputPort,
                               FindVehicleByChassisOutputPort findVehicleByChassisOutputPort,
                               UpdateWorkerOutputPort updateWorkerOutputPort) {
        this.findWorkerByIdInputPort = findWorkerByIdInputPort;
        this.findVehicleByChassisOutputPort = findVehicleByChassisOutputPort;
        this.updateWorkerOutputPort = updateWorkerOutputPort;
    }
    @Override
    public void update(Worker worker, String chassis) {
        findWorkerByIdInputPort.find(worker.getId());
        var vehicle = findVehicleByChassisOutputPort.find(chassis);
        worker.setVehicle(vehicle);
        updateWorkerOutputPort.update(worker);

    }
}
