package com.appiskey.raservice.service;

import com.appiskey.raservice.exception.ResourceNotFoundException;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.BaseRepository;
import com.appiskey.raservice.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
//@Service("baseService")
public class BaselServiceImpl<T> implements BaseService<T>{

    @Autowired
    BaseRepository<T> repository;

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
