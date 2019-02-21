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

//    @Autowired
//    DepartmentRepository repository;

//    @Override
//    public Iterable<Department> searchByDepartmentName(String keyword) {
//        return repository.findByDepartmentNameContainingIgnoreCase(keyword);
//    }

    @Override
    public Iterable<Department> searchDepartment(String keyword) {
        return repository.findByDepartmentNameContainingIgnoreCase(keyword);
    }
//
//    @Override
//    public Department createDepartment(@RequestBody Department department){
//        return departmentRepository.save(department);
//    }
//
//    @Override
//    public Iterable<Department> getAllDepartments(){
//        return departmentRepository.findAllByDeleted(false);
//
//    }
//
//    @Override
//    public Optional<Department> getDepartmentByID(UUID id){
//
//        return departmentRepository.findById(id);
//
//    }
//
//    @Override
//    public String deleteDepartment(UUID id){
//        departmentRepository.deleteById(id);
//        return "Deleted Succesfully!";
//    }

//    @Override
//    public Boolean deleteDepartment(UUID id) {
//        Department department;
//        Optional<Department> departmentOptional = departmentRepository.findById(id);//  findOne(id);
//        if (departmentOptional.isPresent()) {
//            department = departmentOptional.get();
//            department.setDeleted(true);
//            departmentRepository.save(department);
//            // processing with foo ...
//            return true;
//        } else {
//            // alternative processing....
//            return false;
//        }
//    }
//
//    @Override
//    public ResponseEntity<Department> editDepartment(@RequestBody Department department) {
//        Optional<Department> mDepartment = departmentRepository.findById(department.getId());
//        if (!mDepartment.isPresent())
//            return ResponseEntity.notFound().build();
//      //  department.setId(id);
//        department.setCreatedAt(mDepartment.get().getCreatedAt());
//
//        return new ResponseEntity<>(departmentRepository.save(department), HttpStatus.OK);
//    }
//
//    @Override
//    public Iterable<Department> searchDepartment(String keyword){
//        Iterable<Department> department = departmentRepository.findByDepartmentNameContainingIgnoreCase(keyword);
//        return department;
//    }

}
