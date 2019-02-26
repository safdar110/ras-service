package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

//    @Autowired
//    DepartmentRepository departmentRepository;
//
//    @Override
//    public List<Department> searchByDepartmentName(String keyword) {
//        return departmentRepository.findByNameContainingIgnoreCase(keyword);
//    }
}
