package com.pascucci.Hexagonal.application.ports.out;

import com.pascucci.Hexagonal.application.core.domain.Vehicle;

public interface FindVehicleByChassisOutputPort {

    Vehicle find(String chassis);
}
