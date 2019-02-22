package com.appiskey.raservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by khawar on 1/31/19.
 */
@NoRepositoryBean
@Transactional
public interface BaseRepository<T> extends JpaRepository<T, UUID> {
    List<T> findAllByDeleted(Boolean deleted);
}
