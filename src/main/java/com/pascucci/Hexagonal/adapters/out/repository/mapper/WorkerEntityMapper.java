package com.pascucci.Hexagonal.adapters.out.repository.mapper;

import com.pascucci.Hexagonal.adapters.out.repository.entity.WorkerEntity;
import com.pascucci.Hexagonal.application.core.domain.Worker;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WorkerEntityMapper {

     WorkerEntity toWorkerEntity(Worker worker);

     Worker toWoker(WorkerEntity workerEntity);
}
