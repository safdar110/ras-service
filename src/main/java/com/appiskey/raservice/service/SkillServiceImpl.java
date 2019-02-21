package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
@Service("skillService")
public class SkillServiceImpl extends BaseServiceImpl<Skill> implements SkillService {

    @Autowired
    SkillRepository skillRepository;
    @Override
    public Iterable<Skill> searchBySkillName(String keyword) {
        return skillRepository.findByskillNameContainingIgnoreCase(keyword);
    }
}
