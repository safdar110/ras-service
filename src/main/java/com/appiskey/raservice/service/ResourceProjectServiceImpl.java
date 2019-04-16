package com.appiskey.raservice.service;

import com.appiskey.raservice.model.ResourceProject;
import com.appiskey.raservice.repository.ResourceProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service("resourceProject")
public class ResourceProjectServiceImpl extends BaseServiceImpl<ResourceProject> implements ResourceProjectService {

    @Autowired
    ResourceProjectRepository resourceProjectRepository;

    @Override
    public List<ResourceProject> findByProjectId(UUID p_id){
        List<ResourceProject> resourceProjects = (List<ResourceProject>) resourceProjectRepository.findByProjectId(p_id);
        return resourceProjects;

    }

    @Override
    public int countDistinctByProjectId(UUID p_id){

        return resourceProjectRepository.countDistinctByProjectId(p_id);
    }
}
