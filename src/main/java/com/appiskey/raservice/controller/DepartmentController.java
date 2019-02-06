package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
@RestController
@RequestMapping("/api/ras/v1")
public class DepartmentController {

    @Autowired
     DepartmentService departmentService;

    @GetMapping("/department/list")
    public Iterable<Department> getAll(){

        return departmentService.getAllDepartments();
    }

    @PostMapping("/department/add")
    public Department add (@Valid @RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @GetMapping("/department/{uuid}")
    @ResponseBody
    public Optional<Department> retrieveDepartment(@PathVariable("uuid") UUID id) {
        return departmentService.retrieveDepartment(id);

    }

    @PostMapping("/department/delete/{uuid}")
    @ResponseBody
    public String deleteID(@PathVariable("uuid") UUID id)
    {
        departmentService.deleteDepartment(id);
        return"{Response : Deleted }";
    }


    @PutMapping("/department/update/{departmentID}")
    @ResponseBody
    public ResponseEntity<Object> edit(@RequestBody Department department, @PathVariable("departmentID") UUID id) {
   return departmentService.editDepartment(department,id);
    }



}
