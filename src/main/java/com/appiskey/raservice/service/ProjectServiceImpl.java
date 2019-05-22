package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Filter;
import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.projection.*;
import com.appiskey.raservice.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("Projectservice")
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService{

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public ProjectCount findCountDistinct() {

        return projectRepository.findCountDistinct();
    }

    @Override
    public List<ProjectObject> getAllNames(){
        return projectRepository.getAllNames();
    }
   @Override
    public ProjectTotalRevenue findTotalRevenue(){
        return projectRepository.findTotalRevenue();
    }

       @Override
        public BudgetCount findTotalBudget(){
        return  projectRepository.findTotalBudget();
    }

    @Override
    public List<ProjectDetail> findProjectDetail(){
        return projectRepository.findProjectDetail();
    }

    @Override
    public ProjectComplete  findProjectPercentCompleted(){
        return projectRepository.findProjectPercentCompleted();
    }

    @Override
    public FilterTotalRevenue findFilteredTotalRevenue(String to, String from){
        return projectRepository.findFilteredTotalRevenue(to, from);
    }

    @Override
    public List<BudgetDetail> findBudgetDetail(){
        return projectRepository.findBudgetDetail();
    }

    @Override
    public TotalRemaining findTotalRemaining(){
        return projectRepository.findTotalRemaining();
    }

    @Override
    public List<ProjectHealth> findProjectHealth(){
        return projectRepository.findProjectHealth();
    }

    @Override
    public TotalRevenuePerProject findTotalRevenuePerProjectByName(String projectName){
        return projectRepository.findTotalRevenuePerProjectByName(projectName);
    }


}
