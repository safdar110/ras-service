package com.appiskey.raservice.controller;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/skill")
@CrossOrigin(origins = {"http://localhost:4200", "http://someserver:8080"})
public class SkillController {
    @Autowired
    SkillService skillService;

    @GetMapping
    public Iterable<Skill> getAllSkills(){

        return skillService.getAllSkills();
    }

    @PostMapping
    public Skill addSkill (@Valid @RequestBody Skill skill){
        return skillService.createSkill(skill);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Optional<Skill> retrieveSkill(@PathVariable("uuid") UUID id) {
        return skillService.retrieveSkill(id);

    }

    @DeleteMapping
    @ResponseBody
    public String deleteSkillByID(@RequestBody Map<String , UUID> body)
    {
        skillService.deleteSkill(body.get("id"));
        return"{Response : Deleted }";
    }


    @PutMapping
    @ResponseBody
    public ResponseEntity<Skill> editSkill(@RequestBody Skill skill) {
        return skillService.editSkill(skill);
    }

    @PostMapping("/search")
    public Iterable<Skill> findSkillByName(@RequestBody Map<String, String>  body){
        return  skillService.searchSkill(body.get("keyword"));
    }

}
