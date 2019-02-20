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
public class SkillController {

    @Autowired
    SkillService service;

    @GetMapping
    public Iterable<Skill> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Skill insert(@Valid @RequestBody Skill skill) {
        return service.insert(skill);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Skill findById(@PathVariable("uuid") UUID id) {
        return service.findById(id);
    }


    @DeleteMapping("{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(service.findById(id));
    }


    @PutMapping
    @ResponseBody
    public Skill update(@RequestBody Skill skill) {
        return service.update(skill);
    }

    @PostMapping("/search")
    public Iterable<Skill> findSkillByName(@RequestBody Map<String, String> body) {
        return service.searchBySkillName(body.get("keyword"));
    }

}
