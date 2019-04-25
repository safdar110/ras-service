package com.appiskey.raservice.service;

import com.appiskey.raservice.model.ResourceProject;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.UUID;



public interface ResourceProjectService  extends BaseService<ResourceProject> {

    public List<ResourceProject> findByProjectId(UUID p_id);


    public boolean existsByProjectId(UUID id);


    public void deleteAll();

    public void deleteByProjectId(UUID id);

}

