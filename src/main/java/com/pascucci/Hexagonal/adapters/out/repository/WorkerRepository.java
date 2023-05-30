package com.pascucci.Hexagonal.adapters.out.repository;

import com.pascucci.Hexagonal.adapters.out.repository.entity.WorkerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkerRepository extends MongoRepository<WorkerEntity, String> {
}
