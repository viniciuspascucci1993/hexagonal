package com.pascucci.Hexagonal.adapters.in.controller.mapper;

import com.pascucci.Hexagonal.adapters.in.controller.request.WorkerRequest;
import com.pascucci.Hexagonal.adapters.in.controller.response.WorkerResponse;
import com.pascucci.Hexagonal.application.core.domain.Worker;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WorkerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "vehicle", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Worker toWorker(WorkerRequest workerRequest);

    WorkerResponse toWorkerResponse(Worker worker);
}
