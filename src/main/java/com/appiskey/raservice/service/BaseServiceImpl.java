package com.appiskey.raservice.service;

import com.appiskey.raservice.exception.ResourceNotFoundException;
import com.appiskey.raservice.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
public class BaseServiceImpl<R extends BaseRepository<T>, T> implements BaseService<T> {

    @Autowired
    R repository;

    @Override
    public T insert(T item) {
        return repository.save(item);
    }

    @Override
    public Iterable<T> findAll() {
        return repository.findAllByDeleted(false);
    }

    @Override
    public T findById(UUID id) {
        Optional<T> itemOpt = Optional.ofNullable(repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Object", "id", id)));
        return itemOpt.get();
    }

    @Override
    public void delete(T item) {
        repository.delete(item);
    }

    @Override
    public T update(T item) {
        return repository.save(item);
    }
}
