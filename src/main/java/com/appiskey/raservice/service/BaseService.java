package com.appiskey.raservice.service;

import com.appiskey.raservice.model.BaseModel;
import com.appiskey.raservice.model.Skill;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
//@NoRepositoryBean
public interface BaseService<T extends BaseModel> {
    public T insert(T item);
    public List<T> findAll();
    public List<T> searchByName(String keyword);
    public List<T> saveAll(Iterable<T> list);
    public List<T> getAll();
    public T findById(UUID id);
    public T delete(UUID id);
    public T deleteSoft(UUID id);
    public T update(T item);
    public T findByName(String name);
    boolean exists(String name);
}
