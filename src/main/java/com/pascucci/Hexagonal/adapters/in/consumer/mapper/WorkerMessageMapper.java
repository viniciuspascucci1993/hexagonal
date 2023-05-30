package com.pascucci.Hexagonal.adapters.in.consumer.mapper;

import com.pascucci.Hexagonal.adapters.in.consumer.message.WorkerMessage;
import com.pascucci.Hexagonal.application.core.domain.Worker;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WorkerMessageMapper {

    @Mapping(target = "vehicle", ignore = true)
    Worker toWorker(WorkerMessage workerMessage);
}
