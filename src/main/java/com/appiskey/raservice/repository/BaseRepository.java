package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Skill;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */

public abstract interface BaseRepository<T> extends PagingAndSortingRepository<T, UUID> {

//   Iterable<Skill> findByNameContainingIgnoreCase(String keyword);
   Iterable<T> findAllByDeleted(Boolean deleted);
   Iterable<T> findAll();
//   Optional<Skill> findByskillName(String name);
//   Skill findByskillName(String name);

}
