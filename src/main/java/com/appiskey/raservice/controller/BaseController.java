package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.BaseModel;
import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.service.BaseService;
import com.appiskey.raservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

/**
 * Created by khawar on 1/30/19.
 */
//@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class BaseController<S extends BaseService<T>, T extends BaseModel> {

    @Autowired
    S service;

    @GetMapping
    public List<T> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public T insert(@Valid @RequestBody T item) {
        return service.insert(item);
    }

    @PostMapping("/saveall")
    @ResponseStatus(value = HttpStatus.CREATED)
    public List<T> saveAll(@Valid @RequestBody Iterable<T> list) {
        return service.saveAll(list);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public T findById(@PathVariable("uuid") UUID id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public T delete(@PathVariable UUID id) {
        return service.delete(id);
    }

    @PutMapping
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public T update(@RequestBody T item) {
        return service.update(item);
    }
}
