package com.appiskey.raservice.service;

import com.appiskey.raservice.exception.ResourceNotFoundException;
import com.appiskey.raservice.model.BaseModel;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
//@NoRepositoryBean
public class BaseServiceImpl<T extends BaseModel> implements BaseService<T> {

    @Autowired
    BaseRepository<T> repository;

    @Override
    public T insert(T item) {
        return repository.saveAndFlush(item);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public List<T> searchByName(String keyword) {
        return repository.findByNameContainingIgnoreCase(keyword);
    }

    @Override
    public List<T> getAll() {
        return repository.findAllByDeleted(false);
    }

    @Override
    public T findById(UUID id) {
        Optional<T> itemOpt = repository.findById(id);
        if (itemOpt.isPresent()) {
            return itemOpt.get();
        } else {
            return null;
        }

    }

    @Override
    public T delete(UUID id) {
        Optional<T> item = repository.findById(id);
        if (item.isPresent()) {
            deleteSoft(item.get().getId());
            return item.get();
        }
        return null;
    }
    @Override
    public List<T> saveAll(Iterable<T> list) {
        return repository.saveAll(list);
    }

    @Override
    public T deleteSoft(UUID id) {
        Optional<T> item = repository.findById(id);
        if (item.isPresent() && item.get().isDeleted() == false) {
            item.get().setDeleted(true);
            repository.save(item.get());
            return item.get();
        }
        return null;
    }

    @Override
    public T update(T item) {
        return repository.saveAndFlush(item);
    }

    @Override
    public T findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public boolean exists(String name) {
        if (repository.findByName(name) != null) {
            return true;
        }
        return false;
    }
}
