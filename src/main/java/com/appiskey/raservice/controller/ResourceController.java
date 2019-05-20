package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Resource;
import com.appiskey.raservice.projection.*;
import com.appiskey.raservice.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/resource")
public class ResourceController extends BaseController<ResourceService, Resource> {

    @GetMapping("/count")
    public ResourceCount findResourcesCount(){
        return service.findResourcesCount();
    }

    @GetMapping("/total-cost")
    public ResourceTotalCost findResourceTotalCost(){
        return service.findResourceTotalCost();
    }

    @GetMapping("/average-cost")
    public ResourceAverageCost findResourceAverageCost(){
        return service.findResourceAverageCost();
    }

    @GetMapping("/detail")
    public List<ResourceDetails> findResourceDetails(){
        return service.findResourceDetails();
    }

    @GetMapping("/list")
    public List<ResourceList>  findResourceList(){
        return service.findResourceList();
    }

    @GetMapping("/resource-this-month")
    public ResourcesAddedThisMonth findResourcesAddedThisMonth(){
        return service.findResourcesAddedThisMonth();
    }

    @GetMapping("/total-spent-month")
    public TotalSpent findtotalSpentThisMonth(){
        return service.findtotalSpentThisMonth();
    }
}
