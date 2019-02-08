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
@RequestMapping("/api/ras/v1/department")
public class DepartmentController {

    @Autowired
     DepartmentService departmentService;

    @GetMapping("/list")
    public Iterable<Department> getAllDepartments(){

        return departmentService.getAllDepartments();
    }

    @PostMapping("/add")
    public Department addDepartment(@Valid @RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @GetMapping("/get/{uuid}")
    @ResponseBody
    public Optional<Department> retrieveDepartment(@PathVariable("uuid") UUID id) {
        return departmentService.retrieveDepartment(id);

    }

    @PostMapping("/delete/{uuid}")
    @ResponseBody
    public String deleteDepartmentyID(@PathVariable("uuid") UUID id)
    {
        departmentService.deleteDepartment(id);
        return"{Response : Deleted }";
    }


    @PutMapping("/update/{departmentID}")
    @ResponseBody
    public ResponseEntity<Department> editDepartment(@RequestBody Department department, @PathVariable("departmentID") UUID id) {
   return departmentService.editDepartment(department,id);
    }

    @PostMapping("/search")
    public Iterable<Department> findDepartmentByName(@RequestBody Map<String, String> body){
        return  departmentService.searchDepartment(body.get("keyword"));
    }


}
