package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.ResourceProject;
import com.appiskey.raservice.service.ResourceProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(value = "${app.url}" + "/resource-project")
public class ResourceProjectController extends BaseController<ResourceProjectService, ResourceProject> {

    @GetMapping("find//{uuid}")
    public Iterable<ResourceProject> searchByProjectId(@PathVariable("uuid") UUID id){
        return service.findByProjectId(id);
    }
}


