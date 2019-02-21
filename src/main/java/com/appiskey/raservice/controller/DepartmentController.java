package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/department")
public class DepartmentController extends BaseController<DepartmentService, Department> {

//    @Autowired
//    DepartmentService service;
//
//    @GetMapping
//    public Iterable<Department> getAllDepartments() {
//
//        return service.findAll();
//    }
//
//    @PostMapping
//    public Department addDepartment(@Valid @RequestBody Department department) {
//        return service.insert(department);
//    }
//
//    @GetMapping("/{uuid}")
//    @ResponseBody
//    public Department getDepartmentByID(@PathVariable("uuid") UUID id) {
//        return service.findById(id);
//    }
//
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable UUID id) {
//        service.delete(service.findById(id));
//    }
//
//
//    @PutMapping
//    @ResponseBody
//    public Department update(@RequestBody Department department) {
//        return service.update(department);
//    }

//    @PostMapping("/search")
//    public Iterable<Department> findDepartmentByName(@RequestBody Map<String, String> body) {
//        return service.searchDepartment(body.get("keyword"));
//    }


}
