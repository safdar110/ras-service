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

import java.util.Optional;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
@Service("departmentService")
public class DepartmentServiceImpl extends BaseServiceImpl<DepartmentRepository, Department> implements DepartmentService{

    @Override
    public Iterable<Department> searchByDepartmentName(String keyword) {
        return repository.findByDepartmentNameContainingIgnoreCase(keyword);
    }
}
