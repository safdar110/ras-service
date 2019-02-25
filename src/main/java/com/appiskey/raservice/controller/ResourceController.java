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
public class ResourceController extends BaseController<ResourceService, Resource> {

}
