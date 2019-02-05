package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Client;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by khawar on 1/31/19.
 */
public interface ClientRepository extends PagingAndSortingRepository<Client, Integer> {
    Iterable<Client> findAllByDeleted(Boolean deleted);
    Iterable<Client> findAll();
}
