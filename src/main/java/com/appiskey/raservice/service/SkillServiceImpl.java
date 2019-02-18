package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return skillRepository.findAllByDeleted(false);

    }

    @Override
    public Optional<Skill> retrieveSkill(UUID id){

        return skillRepository.findById(id);

    }
    @Override
    public Boolean deleteSkill(UUID id) {
        Skill skill;
        Optional<Skill> skillOptional = skillRepository.findById(id);//  findOne(id);
        if (skillOptional.isPresent()) {
            skill = skillOptional.get();
            skill.setDeleted(true);
            skillRepository.save(skill);
            // processing with foo ...
            return true;
        } else {
            // alternative processing....
            return false;
        }
    }

    @Override
    public ResponseEntity<Skill> editSkill(@RequestBody Skill skill) {
        Optional<Skill> mSkill = skillRepository.findById(skill.getId());
        if (!mSkill.isPresent())
            return ResponseEntity.notFound().build();
        //skill.setId();
        skill.setCreatedAt(mSkill.get().getCreatedAt());

        return new ResponseEntity<>(skillRepository.save(skill),HttpStatus.OK);
    }

    @Override
    public Iterable<Skill> searchSkill(String keyword){
        Iterable<Skill> skill = skillRepository.findByskillNameContainingIgnoreCase(keyword);
     return skill;
    }

    @Override
    public Skill findByskillName(String name) {
       return skillRepository.findByskillName(name);
    }


}
