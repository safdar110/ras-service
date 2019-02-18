package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Resource;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface ResourceRepository extends PagingAndSortingRepository<Resource, UUID> {
    Iterable<Resource> findAllByDeleted(Boolean deleted);
}
