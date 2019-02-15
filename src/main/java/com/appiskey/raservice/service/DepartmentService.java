package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Department;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
public interface DepartmentService {

    public Department createDepartment(Department department);

    public Iterable<Department> getAllDepartments();

    public Optional<Department> getDepartmentByID(UUID id);

    public Boolean deleteDepartment(UUID id);
    public ResponseEntity<Department> editDepartment(Department department);
    public Iterable<Department> searchDepartment(String keyword);
}
