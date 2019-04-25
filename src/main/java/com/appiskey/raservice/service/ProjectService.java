package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Project;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface ProjectService extends BaseService<Project> {

    public Integer findCountDistinct();

    public Object[] getAllNames();

    public double findTotalRevenue();

    public Object findTotalBudget();



}
