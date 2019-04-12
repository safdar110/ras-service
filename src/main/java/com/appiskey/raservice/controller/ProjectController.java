package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.model.ResourceProject;
import com.appiskey.raservice.repository.ResourceProjectRepository;
import com.appiskey.raservice.service.ProjectService;
import com.appiskey.raservice.service.ResourceProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping(value = "${app.url}" + "/project")
public class ProjectController extends BaseController<ProjectService,Project>{

    @Autowired
    ResourceProjectService resourceProjectService;


    @PutMapping("/project")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Project insertProject(@RequestBody Project item) {
      // item.getResourceProjects();
        resourceProjectService.saveAll(item.getResourceProjects());
        return service.update(item);
    }
}
