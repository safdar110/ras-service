package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.ResourceProject;
import com.appiskey.raservice.service.ResourceProjectService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "${app.url}" + "/resource-project")
public class ResourceProjectController extends BaseController<ResourceProjectService, ResourceProject> {
}
