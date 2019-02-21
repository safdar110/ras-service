package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
public interface DepartmentService extends BaseService<Department>{
    public Iterable<Department> searchByDepartmentName(String keyword);
}
