package com.appiskey.raservice.controller;


import com.appiskey.raservice.model.Milestone;
import com.appiskey.raservice.service.MilestoneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${app.url}" + "/milestone")
public class MilestoneController extends BaseController<MilestoneService, Milestone> {
}
