package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Skill;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */

public interface SkillRepository extends PagingAndSortingRepository<Skill, UUID> {

    String query = "SELECT t.skill_name FROM skill t WHERE t.skill_name LIKE CONCAT('%',:keyword,'%')";

   List<Skill> findBySkillNameContaining(String keyword);

    @Query(query)
   List<Skill> findBySkillName(@Param("keyword") String keyword);
}
