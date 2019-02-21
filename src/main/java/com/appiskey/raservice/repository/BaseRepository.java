package com.appiskey.raservice.repository;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by khawar on 1/31/19.
 */
@NoRepositoryBean
public interface BaseRepository<T> extends PagingAndSortingRepository<T, UUID> {
    Iterable<T> findAllByDeleted(Boolean deleted);
}
