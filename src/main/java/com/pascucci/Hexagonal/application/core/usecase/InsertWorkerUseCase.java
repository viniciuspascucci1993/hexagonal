package com.pascucci.Hexagonal.application.core.usecase;

import com.pascucci.Hexagonal.application.core.domain.Worker;
import com.pascucci.Hexagonal.application.ports.in.InsertWorkerInputPort;
import com.pascucci.Hexagonal.application.ports.out.FindVehicleByChassisOutputPort;
import com.pascucci.Hexagonal.application.ports.out.InsertWorkerOutputPort;
import com.pascucci.Hexagonal.application.ports.out.SendCpfWorkerForValidationOutputPort;

public class InsertWorkerUseCase implements InsertWorkerInputPort {

    private final FindVehicleByChassisOutputPort findVehicleByChassisOutputPort;
    private final InsertWorkerOutputPort insertWorkerOutputPort;

    private final SendCpfWorkerForValidationOutputPort sendCpfWorkerForValidationOutputPort;
    public InsertWorkerUseCase(FindVehicleByChassisOutputPort findVehicleByChassisOutputPort,
                               InsertWorkerOutputPort insertWorkerOutputPort,
                               SendCpfWorkerForValidationOutputPort sendCpfWorkerForValidationOutputPort) {
        this.findVehicleByChassisOutputPort = findVehicleByChassisOutputPort;
        this.insertWorkerOutputPort = insertWorkerOutputPort;
        this.sendCpfWorkerForValidationOutputPort = sendCpfWorkerForValidationOutputPort;
    }

    @Override
    public void insert(Worker worker, String chassis) {
        var vehicle = findVehicleByChassisOutputPort.find(chassis);
        worker.setVehicle(vehicle);

        // inserir um worker
        insertWorkerOutputPort.insert(worker);
        sendCpfWorkerForValidationOutputPort.send(worker.getCpf());
    }
}
