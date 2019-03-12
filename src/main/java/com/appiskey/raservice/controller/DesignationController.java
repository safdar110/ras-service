package com.appiskey.raservice.controller;


import com.appiskey.raservice.model.Designation;
import com.appiskey.raservice.service.DesignationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${app.url}" + "/designation")
public class DesignationController extends BaseController<DesignationService, Designation> {
}
