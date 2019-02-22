package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
public interface SkillService extends  BaseService<Skill> {
    List<Skill> searchBySkillName(String keyword);
    Skill getSkillBySkillName(String name);
    boolean exists(String name);
//    Optional<Skill> getSkillBySkillId(UUID id);
}
