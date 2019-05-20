package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.projection.*;
import com.appiskey.raservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/department")
public class DepartmentController extends BaseController<DepartmentService, Department> {

    @PostMapping("/search")
    public List<Department> searchByName(@RequestBody Map<String, String> body) {
        return service.searchByName(body.get("keyword"));
    }
    @GetMapping("/bench")
    public List<DepartmentMinBench>findMinBenchMark(){
        return service.findMinBench();
    }

    @GetMapping("/total-departments")
    public DepartmentTotalCount findTotalDepartments() {
        return service.findTotalDepartments();
    }

    @GetMapping("/total-cost")
    public DepartmentTotalCost findTotalDepartmentCost() {
        return service.findTotalDepartmentCost();
    }

    @GetMapping("/average-cost")
    public DepartmentAverageCost findAverageDepartmentCost() {
        return service.findAverageDepartmentCost();
    }

    @GetMapping("/average-revenue")
    public DepartmentAverageRevenue findAverageDepartmentRevenue() {
        return service.findAverageDepartmentRevenue();

    }

    @GetMapping("department-details")
    public List<DepartmentDetail> findDepartmentsDetail(){
        return service.findDepartmentsDetail();
    }
//


}
