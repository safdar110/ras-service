package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.service.DepartmentService;
import com.appiskey.raservice.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
@RestController
@RequestMapping("/api/ras/v1")
public class SkillController {
    @Autowired
    SkillService skillService;

    @GetMapping("/skill/list")
    public Iterable<Skill> getAllSkills(){

        return skillService.getAllSkills();
    }

    @PostMapping("/skill/add")
    public Skill add (@Valid @RequestBody Skill skill){
        return skillService.createSkill(skill);
    }

    @GetMapping("/skill/{uuid}")
    @ResponseBody
    public Optional<Skill> retrieveSkill(@PathVariable("uuid") UUID id) {
        return skillService.retrieveSkill(id);

    }

    @PostMapping("/skill/delete/{uuid}")
    @ResponseBody
    public String deleteID(@PathVariable("uuid") UUID id)
    {
        skillService.deleteSkill(id);
        return"{Response : Deleted }";
    }


    @PutMapping("/skill/update/{skillID}")
    @ResponseBody
    public ResponseEntity<Object> editSkill(@RequestBody Skill skill, @PathVariable("skillID") UUID id) {
        return skillService.editSkill(skill,id);
    }

    @PostMapping("/skill/search")
    public Iterable<Skill> findSkillByName(@RequestBody Map<String, String>  body){
        return  skillService.searchSkill(body.get("keyword"));
    }

}
