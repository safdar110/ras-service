package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Project;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface ProjectRepository extends BaseRepository<Project>{

    @Query("SELECT COUNT(*) FROM Project")
    Integer findCountDistinct();



    @Query(nativeQuery = true, value="Select DISTINCT(p.name) from project p Join project_project_milestones m ON p.id = m.project_id JOIN (Select * from milestone where milestone_delievery_date < CURRENT_DATE) t ON m.project_milestones_id = t.id"
    )
    public Object[] getAllNames();

    @Query("SELECT (COUNT(*) * SUM(projectCost)) FROM Project")
    public double findTotalRevenue();

    @Query(nativeQuery = true , value= "SELECT (SELECT (COUNT(*) * SUM(project_cost)) FROM project) + (SELECT Sum(expense_amount) FROM fringe_benefit) as result")
    public Object findTotalBudget();


//    SELECT (SELECT (COUNT(*) * SUM(project_cost)) FROM project) + (SELECT Sum(expense_amount) FROM fringe_benefit) as result

}


//    Select DISTINCT(p.name) from project p Join project_project_milestones m ON p.id = m.project_id JOIN (Select * from milestone where milestone_delievery_date < CURRENT_DATE) t ON m.project_milestones_id = t.id
