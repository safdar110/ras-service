package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
public interface SkillService {
    public Skill createSkill(Skill skill);
    public Iterable<Skill> getAllSkills();
    public Optional<Skill> retrieveSkill(UUID id);
    public ResponseEntity<Skill> deleteSkill(Skill skill);
    public ResponseEntity<Skill> editSkill(Skill skill);
    public Iterable<Skill> searchSkill(String keyword);
}
