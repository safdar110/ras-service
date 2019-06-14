package com.appiskey.raservice.repository;
import com.appiskey.raservice.model.Filter;
import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.projection.*;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


public interface ProjectRepository extends BaseRepository<Project>{

    @Query("SELECT COUNT(*) as totalProjectCount FROM Project")
    ProjectCount findCountDistinct();

    @Query(nativeQuery = true, value="Select DISTINCT(p.name) as name from project p Join project_project_milestones m ON p.id = m.project_id JOIN (Select * from milestone where milestone_delievery_date < CURRENT_DATE) t ON m.project_milestones_id = t.id")
    public List<ProjectObject> getAllNames();

    @Query(nativeQuery = true,value="SELECT (SELECT (COALESCE(SUM(milestone_expected_payment),0)) FROM milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id = pm.project_id where m.flag =1) as totalRevenue")
    public ProjectTotalRevenue findTotalRevenue();

    @Query(nativeQuery = true, value= "SELECT (SELECT (COALESCE(SUM(milestone_expected_payment),0)) FROM milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id = pm.project_id where m.flag =1) as totalRevenue,  (SELECT SUM(r.resource_salary_per_month* rp.resource_project_allocation/100) from resource r JOIN resource_project rp ON r.id = rp.resource_id) as totalExpense, (SELECT totalRevenue)-(SELECT totalExpense) as totalBudget")
    public BudgetCount findTotalBudget();

    @Query(nativeQuery = true, value="SELECT p.name as projectName,ANY_VALUE(p.project_cost) as projectCost, ANY_VALUE(p.project_timeline) as projectTimeline,ANY_VALUE(m.name) as CurrentMilestone, ANY_VALUE(m.milestone_delievery_date) as currentMilestoneDeliveryDate, SUM(m.milestone_percent_complete) as percentCompleted from project p JOIN project_project_milestones pm on p.id=pm.project_id JOIN milestone m ON m.id = pm.project_milestones_id WHERE CURRENT_DATE BETWEEN m.milestone_start_date AND m.milestone_delievery_date group by p.name")
    public List<ProjectDetail> findProjectDetail();

    @Query(nativeQuery = true, value="SELECT (COALESCE(SUM(m.milestone_percent_complete),0)) as percentCompleted from milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN  project p ON p.id = pm.project_id WHERE CURRENT_DATE BETWEEN m.milestone_start_date AND m.milestone_delievery_date")
    public ProjectComplete findProjectPercentCompleted();

    @Query( nativeQuery = true, value="SELECT (SELECT COALESCE(SUM(milestone_expected_payment),0) FROM milestone m JOIN  project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id = pm.project_id where (m.milestone_start_date >= :to AND m.milestone_delievery_date <= :from) AND (m.flag = 1 )) as totalRevenue,  (SELECT COALESCE(Sum(expense_amount),0) FROM fringe_benefit) as totalExpense, (SELECT totalRevenue)-(SELECT totalExpense) as totalBudget")
    public FilterTotalRevenue findFilteredTotalRevenue(@Param("to") String to, @Param("from")  String from);

    @Query(nativeQuery = true, value="SELECT p.name as projectName , p.project_cost as totalBudget,SUM(r.resource_salary_per_month* rp.resource_project_allocation/100) as totalSpent from resource r JOIN resource_project rp ON r.id = rp.resource_id JOIN project p ON p.id = rp.project_id group by p.name, p.project_cost")
    public List<BudgetDetail> findBudgetDetail();

    @Query(nativeQuery = true, value = "SELECT (SELECT (COALESCE(SUM(milestone_expected_payment),0)) FROM milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id = pm.project_id where m.flag =0) as totalRemaining")
    public TotalRemaining findTotalRemaining();

    @Query(nativeQuery = true, value= "SELECT p.name as ProjectName, (COALESCE(SUM(m.milestone_total_percent/100 * p.project_cost),0)) as PlannedValue, (COALESCE(SUM(m.milestone_percent_complete/100 * p.project_cost),0)) as EarnedValue,(COALESCE(SUM(r.resource_salary_per_month* rp.resource_project_allocation/100),0)) as actualCost, (COALESCE(SUM(m.milestone_percent_complete/100 * p.project_cost),0))/(COALESCE(SUM(r.resource_salary_per_month* rp.resource_project_allocation/100),0)) as CPI,(COALESCE(SUM(m.milestone_percent_complete/100 * p.project_cost),0))/(COALESCE(SUM(m.milestone_total_percent/100 * p.project_cost),0)) as SPI from milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id =pm.project_id JOIN resource_project rp ON p.id = rp.project_id JOIN resource r ON r.id = rp.resource_id GROUP BY p.name, p.project_cost")
    public List<ProjectHealth> findProjectHealth();

    @Query(nativeQuery = true, value = "SELECT (SELECT (COALESCE(SUM(milestone_expected_payment),0)) FROM milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id = pm.project_id where p.name =:projectName AND m.flag =1) as totalRevenuePerProject")
    public TotalRevenuePerProject findTotalRevenuePerProjectByName(@Param("projectName") String projectName);


    //Project health with coalesce

//    SELECT p.name as ProjectName,(COALESCE(SUM(m.milestone_total_percent/100 * p.project_cost),0)) as PlannedValue, (COALESCE( SUM(m.milestone_percent_complete/100 * p.project_cost),0)) as EarnedValue, (COALESCE(SUM(r.resource_salary_per_month* rp.resource_project_allocation/100),0)) as actualCost, (COALESCE( SUM(m.milestone_percent_complete/100 * p.project_cost),0))/ (COALESCE(SUM(r.resource_salary_per_month* rp.resource_project_allocation/100),0)) as CPI, (COALESCE( SUM(m.milestone_percent_complete/100 * p.project_cost) ,0))/(COALESCE(SUM(m.milestone_total_percent/100 * p.project_cost),0)) as SPI from milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id =pm.project_id JOIN resource_project rp ON p.id = rp.project_id JOIN resource r ON r.id = rp.resource_id GROUP BY p.name, p.project_cost
//    @Query("")
//    public
//    resource on ow much projects involved
//    SELECT r.name, COUNT(p.name) from project p JOIN resource_project rp ON p.id= rp.project_id JOIN resource r ON r.id = rp.resource_id group by r.name;



//    SELECT (SELECT (COUNT(*) * SUM(project_cost)) FROM project) + (SELECT Sum(expense_amount) FROM fringe_benefit) as result

}


//    Select DISTINCT(p.name) from project p Join project_project_milestones m ON p.id = m.project_id JOIN (Select * from milestone where milestone_delievery_date < CURRENT_DATE) t ON m.project_milestones_id = t.id

//    SELECT client_name from client where EXTRACT(MONTH FROM updated_At AND YEAR FROM updated_At) = (CURRENT_MONTH AND CURRENT_YEAR)
//
//        SELECT c.client_name, p.COUNT(project_client) from client c JOIN project p ON c.id = p.client_id group by client_name;
//
//        SELECT project_client, SUM(projectCost) from project group by project_client;


//Total revenue from each client

//    SELECT c.name, SUM(project_cost) from client c JOIN project p ON c.id = p.client_id group by c.name;

//    SELECT count(*) from client where EXTRACT(MONTH FROM created_at) = EXTRACT(MONTH FROM CURRENT_DATE) AND EXTRACT(YEAR FROM created_at) =EXTRACT(YEAR FROM CURRENT_DATE)



// project with its milestones
//SELECT DISTINCT(p.name), COUNT(m.id) from milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id= pm.project_id group by p.name HAVING COUNT(m.milestone_delievery_date) < CURRENT_DATE

//project pecrent completed


//    SELECT(COUNT(*) * SUM(project_cost)) as totalRevenue from project where EXTRACT(MONTH FROM created_at) = EXTRACT(MONTH FROM CURRENT_DATE) AND EXTRACT(YEAR FROM created_at) =EXTRACT(YEAR FROM CURRENT_DATE)
//SELECT  100 *(SELECT COUNT(m.id) from milestone m WHERE m.milestone_delievery_date < CURRENT_DATE)/COUNT(*) as projectCompleted from milestone

//    SELECT (SELECT (COUNT(*) * COALESCE(SUM(project_cost),0)) FROM project) as totalRevenue,  (SELECT COALESCE(Sum(expense_amount),0) FROM fringe_benefit) as totalExpense, (SELECT (COUNT(*) * COALESCE(SUM(project_cost),0)) FROM project)-(SELECT COALESCE(Sum(expense_amount),0) FROM fringe_benefit) as totalBudget



//    SELECT p.name as projectName, p.project_cost as totalBudget,(SELECT SUM(r.resource_salary_per_month* rp.resource_project_allocation/100) from resource r JOIN resource_project rp ON r.id = rp.resource_id JOIN project p ON p.id = rp.project_id) as totalSpent from project p


//Earned and planned vallue
//SELECT p.name as ProjectName, SUM(m.milestone_total_percent/100 * p.project_cost) as PlannedValue, SUM(m.milestone_percent_complete/100 * p.project_cost) as EarnedValue from milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id =pm.project_id  GROUP BY p.name

//Earned planned with actual Cost
//SELECT p.name as ProjectName, SUM(m.milestone_total_percent/100 * p.project_cost) as PlannedValue, SUM(m.milestone_percent_complete/100 * p.project_cost) as EarnedValue,SUM(r.resource_salary_per_month* rp.resource_project_allocation/100) as actualCost from milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id =pm.project_id JOIN  resource_project rp ON p.id = rp.project_id JOIN resource r ON r.id = rp.resource_id GROUP BY p.name, p.project_cost

//    SELECT SUM(m.milestone_percent_complete) as percentCompleted from milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN  project p ON p.id = pm.project_id WHERE CURRENT_DATE BETWEEN m.milestone_start_date AND m.milestone_delievery_date
