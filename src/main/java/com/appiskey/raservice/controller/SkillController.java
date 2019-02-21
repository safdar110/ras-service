package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.service.BaseService;
import com.appiskey.raservice.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/skill")
public class SkillController extends BaseController<SkillService, Skill> {

    @PostMapping("/search")
    public Iterable<Skill> searchByName(@RequestBody Map<String, String> body) {
        return service.searchBySkillName(body.get("keyword"));
    }
}
