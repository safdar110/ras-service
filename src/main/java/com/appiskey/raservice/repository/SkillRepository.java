package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Skill;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
public interface SkillRepository extends BaseRepository<Skill> {
    Iterable<Skill> findByskillNameContainingIgnoreCase(String keyword);
}
