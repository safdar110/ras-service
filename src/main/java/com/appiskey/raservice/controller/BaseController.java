package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.service.BaseService;
import com.appiskey.raservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * Created by khawar on 1/30/19.
 */
//@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class BaseController<S extends BaseService<T>, T> {

    @Autowired
    S service;

    @GetMapping
    public Iterable<T> getAll() {

        return service.findAll();
    }

    @PostMapping
    public T insert(@Valid @RequestBody T item) {
        return service.insert(item);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public T findById(@PathVariable("uuid") UUID id) {
        return service.findById(id);
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(service.findById(id));
    }

    @PutMapping
    @ResponseBody
    public T update(@RequestBody T item) {
        return service.update(item);
    }

}
