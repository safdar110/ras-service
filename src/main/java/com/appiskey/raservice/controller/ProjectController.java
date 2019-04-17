package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.model.ResourceProject;
import com.appiskey.raservice.repository.ResourceProjectRepository;
import com.appiskey.raservice.service.ProjectService;
import com.appiskey.raservice.service.ResourceProjectService;
import org.hibernate.NonUniqueResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "${app.url}" + "/project")
public class ProjectController extends BaseController<ProjectService,Project>{

    @Autowired
    ResourceProjectService resourceProjectService;

    @Autowired
    ResourceProjectRepository resourceProjectRepository;


    @PutMapping("/project")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Project insertProject(@RequestBody Project item) {
      // item.getResourceProjects();

//        if(resourceProjectService.existsByProjectId(item.getId())) {
//            resourceProjectService.delete(item.getId());
//        }
       if(resourceProjectService.existsByProjectId(item.getId()))
       resourceProjectService.deleteByProjectId(item.getId());
        //System.out.println("/");


        resourceProjectService.saveAll(item.getResourceProjects());
                return service.update(item);

        }












}
