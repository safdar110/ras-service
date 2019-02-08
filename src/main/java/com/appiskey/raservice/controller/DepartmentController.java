package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
     DepartmentService departmentService;

    @GetMapping
    public Iterable<Department> getAllDepartments(){

        return departmentService.getAllDepartments();
    }

    @PostMapping
    public Department addDepartment(@Valid @RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Optional<Department> getDepartmentByID(@PathVariable("uuid") UUID id) {
        return departmentService.getDepartmentByID(id);

    }

    @DeleteMapping
    @ResponseBody
    public String deleteDepartmentID(@RequestBody Map<String, UUID> body)
    {
        departmentService.deleteDepartment(body.get("id"));
        return"{Response : Deleted }";
    }


    @PutMapping
    @ResponseBody
    public ResponseEntity<Department> editDepartment(@RequestBody Department department) {
   return departmentService.editDepartment(department);
    }

    @PostMapping("/search")
    public Iterable<Department> findDepartmentByName(@RequestBody Map<String, String> body){
        return  departmentService.searchDepartment(body.get("keyword"));
    }


}
