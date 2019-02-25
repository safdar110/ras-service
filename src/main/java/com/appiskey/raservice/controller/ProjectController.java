package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.service.ProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "${app.url}" + "/project")
public class ProjectController extends BaseController<ProjectService,Project>{
}
