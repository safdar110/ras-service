package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service("Projectservice")
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService{

    @Autowired
    ProjectRepository projectRepository;

    @Override
    public Integer findCountDistinct() {

        return projectRepository.findCountDistinct();
    }

    @Override
    public Object[] getAllNames(){
        return projectRepository.getAllNames();
    }
   @Override
    public double findTotalRevenue(){
        return projectRepository.findTotalRevenue();
    }

       @Override
        public Object findTotalBudget(){
        return  projectRepository.findTotalBudget();
    }
}
