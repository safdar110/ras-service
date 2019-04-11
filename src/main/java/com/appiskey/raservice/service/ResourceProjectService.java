package com.appiskey.raservice.service;

import com.appiskey.raservice.model.ResourceProject;


import java.util.List;
import java.util.UUID;

public interface ResourceProjectService  extends BaseService<ResourceProject> {

    public List<ResourceProject> findByProjectId(UUID p_id);
}

