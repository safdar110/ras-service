package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.projection.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
public interface DepartmentService extends BaseService<Department>{
//    public List<Department> searchByDepartmentName(String keyword);
public List<DepartmentMinBench> findMinBench();

    public DepartmentTotalCount findTotalDepartments();

    public DepartmentTotalCost findTotalDepartmentCost();

    public DepartmentAverageCost findAverageDepartmentCost();

    public DepartmentAverageRevenue findAverageDepartmentRevenue();

    public List<DepartmentDetail> findDepartmentsDetail();


}
