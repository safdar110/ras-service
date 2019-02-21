package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Department;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
@Qualifier("departmentService")
public interface DepartmentRepository extends PagingAndSortingRepository<Department, UUID> {
    Iterable<Department> findByDepartmentNameContainingIgnoreCase(String keyword);
    Iterable<Department> findAllByDeleted(Boolean deleted);
}

