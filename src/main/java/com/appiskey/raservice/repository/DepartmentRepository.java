package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.projection.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */

public interface DepartmentRepository extends BaseRepository<Department> {
//    List<Department> findByDepartmentNameContainingIgnoreCase(String keyword);

    @Query(nativeQuery = true, value="SELECT  DISTINCT(name) as name, MAX(department_bench-100) as minBench FROM department where department_bench > 100 group by department_bench , name")
    public List<DepartmentMinBench> findMinBench();

    @Query("SELECT COUNT(DISTINCT name) as count from Department")
    public DepartmentTotalCount findTotalDepartments();

    @Query("SELECT COALESCE(SUM(resourceSalaryPerMonth),0) as totalCost from Resource")
    public DepartmentTotalCost findTotalDepartmentCost();

    @Query("SELECT COALESCE(SUM(resourceSalaryPerMonth)/COUNT(*),0) as averageCost from Resource")
    public DepartmentAverageCost findAverageDepartmentCost();

//    @Query("SELECT COALESCE(SUM(milestoneCost)/COUNT(*),0.00) as averageRevenue from Milestone")
    @Query(nativeQuery = true, value = "SELECT (SELECT (COALESCE(SUM(milestone_expected_payment)/COUNT(*),0)) FROM milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id = pm.project_id where m.flag =1) as averageRevenue")
    public DepartmentAverageRevenue findAverageDepartmentRevenue();

    @Query(nativeQuery = true, value= "SELECT d.name as name, COUNT(r.name) as totalResources, SUM(rp.resource_project_allocation) as resourcesOccupied , 100-SUM(rp.resource_project_allocation) as resourcesBench , IF(SUM(rp.resource_project_allocation)  > 100, SUM(rp.resource_project_allocation)-100, 0)  as departmentThreshold, COUNT(rp.project_id) as totalProjects from department d JOIN resource r ON d.id = r.department_id JOIN resource_project rp ON r.id = rp.resource_id GROUP by d.name")
    public List<DepartmentDetail> findDepartmentsDetail();

//    SELECT d.name, COUNT(r.name), SUM(d.department_bench), 100-SUM(d.department_bench)as resource_occupied from department d JOIN resource r ON d.id = r.department_id GROUP by d.name;

//    SELECT d.name , count(p.name) from  department d JOIN resource r ON d.id = r.department_id JOIN resource_project rp ON r.id= rp.resource_id JOIN project p ON p.id = rp.project_id GROUP by d.name;
}
//Department detail
//    SELECT d.name as name, COUNT(r.name) as totalResources, SUM(d.department_bench) as resourcesBench, 100-SUM(rp.resource_project_allocation) as resourcesOccupied , MAX(d.department_bench)  as departmentThreshold, COUNT(rp.project_id) from department d JOIN resource r ON d.id = r.department_id JOIN resource_project rp ON r.id = rp.resource_id GROUP by d.name

