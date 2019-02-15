package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.model.Department;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 1/31/19.
 */
public interface ClientRepository extends PagingAndSortingRepository<Client, UUID> {
    Iterable<Client> findByClientNameContainingIgnoreCase(String keyword);
    Iterable<Client> findAllByDeleted(Boolean deleted);
    Iterable<Client> findAll();

}
