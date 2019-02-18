package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Resource;
import com.appiskey.raservice.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/resource")
public class ResourceController {

    @Autowired
    ResourceService resourceService;

    @GetMapping
    public Iterable<Resource> getAllResources(){

        return resourceService.getAllResources();
    }

    @PostMapping
    public Resource addResource(@Valid @RequestBody Resource resource){
        return resourceService.createResource(resource);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Optional<Resource> getResourceByID(@PathVariable("uuid") UUID id) {
        return resourceService.getResourceByID(id);

    }

    @DeleteMapping
    @ResponseBody
    public ResponseEntity<Resource> deleteResource(@RequestBody Resource resource)
    {

        return resourceService.deleteResource(resource);
    }


    @PutMapping
    @ResponseBody
    public ResponseEntity<Resource> editOperatingCost(@RequestBody Resource resource) {
        return resourceService.editResource(resource);
    }

}
