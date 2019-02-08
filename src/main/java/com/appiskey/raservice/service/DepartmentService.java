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

    public Optional<Department> retrieveDepartment(UUID id);

    public String deleteDepartment(UUID id);
    public ResponseEntity<Department> editDepartment(Department department, UUID id);
    public Iterable<Department> searchDepartment(String keyword);
}
