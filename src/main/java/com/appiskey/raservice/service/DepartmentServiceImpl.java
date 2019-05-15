package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.projection.*;
import com.appiskey.raservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService{
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentMinBench> findMinBench(){
        return departmentRepository.findMinBench();
    }

    @Override
    public DepartmentTotalCount findTotalDepartments() {
        return departmentRepository.findTotalDepartments();
    }

    @Override
    public DepartmentTotalCost findTotalDepartmentCost() {
        return departmentRepository.findTotalDepartmentCost();
    }


    @Override
    public DepartmentAverageCost findAverageDepartmentCost() {
        return departmentRepository.findAverageDepartmentCost();
    }


    @Override
    public DepartmentAverageRevenue findAverageDepartmentRevenue() {
        return departmentRepository.findAverageDepartmentRevenue();


    }
    @Override
    public List<DepartmentDetail> findDepartmentsDetail(){
        return departmentRepository.findDepartmentsDetail();
    }
//    @Autowired
//    DepartmentRepository departmentRepository;
//
//    @Override
//    public List<Department> searchByDepartmentName(String keyword) {
//        return departmentRepository.findByNameContainingIgnoreCase(keyword);
//    }
}
