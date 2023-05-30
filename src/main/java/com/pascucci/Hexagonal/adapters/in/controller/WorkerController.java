package com.pascucci.Hexagonal.adapters.in.controller;

import com.pascucci.Hexagonal.adapters.in.controller.mapper.WorkerMapper;
import com.pascucci.Hexagonal.adapters.in.controller.request.WorkerRequest;
import com.pascucci.Hexagonal.adapters.in.controller.response.WorkerResponse;
import com.pascucci.Hexagonal.application.core.domain.Worker;
import com.pascucci.Hexagonal.application.ports.in.DeleteWorkerByIdInputPort;
import com.pascucci.Hexagonal.application.ports.in.FindWorkerByIdInputPort;
import com.pascucci.Hexagonal.application.ports.in.InsertWorkerInputPort;
import com.pascucci.Hexagonal.application.ports.in.UpdateWorkerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v2/workers")
public class WorkerController {

    @Autowired
    private InsertWorkerInputPort insertWorkerInputPort;

    @Autowired
    private FindWorkerByIdInputPort findWorkerByIdInputPort;

    @Autowired
    private UpdateWorkerInputPort updateWorkerInputPort;

    @Autowired
    private DeleteWorkerByIdInputPort deleteWorkerByIdInputPort;

    @Autowired
    private WorkerMapper workerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody WorkerRequest workerRequest) {
        var worker = workerMapper.toWorker(workerRequest);
        insertWorkerInputPort.insert(worker, workerRequest.getChassis());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkerResponse> findById(@PathVariable final String id) {
        var worker = findWorkerByIdInputPort.find(id);
        var workerResponse = workerMapper.toWorkerResponse(worker);
        return ResponseEntity.ok().body(workerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id, @RequestBody WorkerRequest workerRequest) {
        Worker worker = workerMapper.toWorker(workerRequest);
        worker.setId(id);
        updateWorkerInputPort.update(worker, workerRequest.getChassis());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id) {
        deleteWorkerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
