package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Feature;
import com.appiskey.raservice.service.FeatureService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${app.url}" + "/feature")
public class FeatureController extends BaseController<FeatureService, Feature> {
}
