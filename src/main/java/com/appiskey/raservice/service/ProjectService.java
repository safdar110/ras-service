package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Filter;
import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.projection.*;

import java.util.Date;
import java.util.List;

public interface ProjectService extends BaseService<Project> {

    public ProjectCount findCountDistinct();

    public List<ProjectObject> getAllNames();

    public ProjectTotalRevenue findTotalRevenue();

    public BudgetCount findTotalBudget();

    public List<ProjectDetail> findProjectDetail();

    public List<ProjectComplete>  findProjectPercentCompleted();

    public FilterTotalRevenue findFilteredTotalRevenue(String to, String from);

    public List<BudgetDetail> findBudgetDetail();

    public TotalRemaining findTotalRemaining();




}
