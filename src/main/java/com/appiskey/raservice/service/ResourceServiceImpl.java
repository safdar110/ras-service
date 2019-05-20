package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Resource;
import com.appiskey.raservice.projection.*;
import com.appiskey.raservice.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
@Service("ResourceService")
public class ResourceServiceImpl extends BaseServiceImpl<Resource> implements ResourceService {

    @Autowired
    ResourceRepository resourceRepository;

    @Override
    public ResourceCount findResourcesCount(){
        return resourceRepository.findResourcesCount();
    }

    @Override
    public ResourceTotalCost findResourceTotalCost(){
        return resourceRepository.findResourceTotalCost();
    }
    @Override
    public ResourceAverageCost findResourceAverageCost(){
        return resourceRepository.findResourceAverageCost();
    }

    @Override
    public List<ResourceDetails> findResourceDetails(){
        return resourceRepository.findResourceDetails();
    }

    @Override
    public List<ResourceList>  findResourceList(){
        return resourceRepository.findResourceList();
    }

    @Override
    public ResourcesAddedThisMonth findResourcesAddedThisMonth(){
        return resourceRepository.findResourcesAddedThisMonth();
    }

    @Override
    public TotalSpent findtotalSpentThisMonth(){
        return resourceRepository.findtotalSpentThisMonth();
    }
}
