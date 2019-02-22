package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
@Service("skillService")
public class SkillServiceImpl extends BaseServiceImpl<Skill> implements SkillService {

    @Autowired
    SkillRepository skillRepository;

    @Override
    public List<Skill> searchBySkillName(String keyword) {
        return skillRepository.findByskillNameContainingIgnoreCase(keyword);
    }

    @Override
    public Skill getSkillBySkillName(String name) {
        return skillRepository.findBySkillName(name);
    }

    @Override
    public boolean exists(String name) {
        if (skillRepository.findBySkillName(name) != null) {
            return true;
        }
        return false;
    }

//    @Override
//    public Optional<Skill> getSkillBySkillId(UUID id) {
//        return skillRepository.findById(id);
//    }
}
