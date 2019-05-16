package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Resource;
import com.appiskey.raservice.projection.*;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface ResourceService extends BaseService<Resource> {

    public ResourceCount findResourcesCount();
    public ResourceTotalCost findResourceTotalCost();
    public ResourceAverageCost findResourceAverageCost();
    public List<ResourceDetails> findResourceDetails();
    public List<ResourceList>  findResourceList();
    public ResourcesAddedThisMonth findResourcesAddedThisMonth();
    public TotalSpent findtotalSpentThisMonth();






}
