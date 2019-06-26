package com.appiskey.raservice.repository;


import com.appiskey.raservice.model.Resource;
import com.appiskey.raservice.projection.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface ResourceRepository extends BaseRepository<Resource>{

    @Query("SELECT Count(*) as totalResourceCount from Resource")
    public ResourceCount findResourcesCount();

    @Query("SELECT COALESCE(SUM(resourceSalaryPerMonth),0) as totalCost FROM Resource")
    public ResourceTotalCost findResourceTotalCost();

    @Query(nativeQuery = true, value= "SELECT COALESCE(SUM(resource_salary_per_month)/COUNT(*),0) as resourceAverageCost FROM resource")
    public ResourceAverageCost findResourceAverageCost();

    @Query(nativeQuery = true, value="SELECT r.name as resourceName, COUNT(p.name) as totalProjects,SUM(rp.resource_project_allocation) as resourceOccupied, 100-(SUM(rp.resource_project_allocation)) as resourceFree, SUM((rp.resource_project_allocation/100) * p.project_cost) as RevenuePerResource from project p JOIN resource_project rp ON p.id= rp.project_id JOIN resource r ON r.id = rp.resource_id group by r.name")
    public List<ResourceDetails> findResourceDetails();

    @Query(nativeQuery = true, value = "SELECT r.name as resourceName, d.name as resourceDesignation , r.resource_email as resourceEmail, r.resource_phone as resourcePhone from resource r JOIN designation d ON d.id = r.designation_id")
    public List<ResourceList>  findResourceList();

    @Query(nativeQuery = true, value = "SELECT count(*) as count from resource where EXTRACT(MONTH FROM created_at) = EXTRACT(MONTH FROM CURRENT_DATE) AND EXTRACT(YEAR FROM created_at) =EXTRACT(YEAR FROM created_at)")
    public ResourcesAddedThisMonth findResourcesAddedThisMonth();

    @Query(nativeQuery = true,value="SELECT COALESCE(SUM(r.resource_salary_per_month* rp.resource_project_allocation/100),0) as totalSpentThisMonth from resource r JOIN resource_project rp ON r.id = rp.resource_id where EXTRACT(MONTH FROM rp.created_at) = EXTRACT(MONTH FROM CURRENT_DATE) AND EXTRACT(YEAR FROM rp.created_at) =EXTRACT(YEAR FROM CURRENT_DATE)")
    public TotalSpent findtotalSpentThisMonth();


}
