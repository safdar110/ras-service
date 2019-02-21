package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.UUID;

/**
 * Created by appiskey on 2/4/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/department")
public class DepartmentController extends BaseController<DepartmentService, Department> {

    @PostMapping("/search")
    public Iterable<Department> searchByName(@RequestBody Map<String, String> body) {
        return service.searchByDepartmentName(body.get("keyword"));
    }
}
