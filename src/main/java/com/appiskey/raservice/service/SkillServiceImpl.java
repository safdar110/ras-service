package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
@Service("skillService")
public class SkillServiceImpl implements SkillService{

    @Autowired
    SkillRepository skillRepository;

    @Override
    public Skill createSkill(@RequestBody Skill skill){
        return skillRepository.save(skill);
    }

    @Override
    public Iterable<Skill> getAllSkills(){
        return skillRepository.findAll();

    }

    @Override
    public Optional<Skill> retrieveSkill(UUID id){

        return skillRepository.findById(id);

    }

    @Override
    public String deleteSkill(UUID id){
        skillRepository.deleteById(id);
        return "Deleted Succesfully!";
    }

    @Override
    public ResponseEntity<Object> editSkill(@RequestBody Skill skill, UUID id) {
        Optional<Skill> OS = skillRepository.findById(id);
        if (!OS.isPresent())
            return ResponseEntity.notFound().build();
        skill.setId(id);
        skillRepository.save(skill);
        return ResponseEntity.noContent().build();
    }

    @Override
    public Iterable<Skill> searchSkill(String keyword){
        Iterable<Skill> skill = skillRepository.findByskillNameContainingIgnoreCase(keyword);
     return skill;
    }


}
