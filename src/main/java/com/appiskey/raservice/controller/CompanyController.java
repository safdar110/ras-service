package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Company;
import com.appiskey.raservice.service.CompanyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "${app.url}" + "/company")
public class CompanyController extends BaseController<CompanyService, Company> {
}

