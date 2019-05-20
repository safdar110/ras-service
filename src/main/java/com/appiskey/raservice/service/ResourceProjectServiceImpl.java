package com.appiskey.raservice.service;

import com.appiskey.raservice.model.ResourceProject;
import com.appiskey.raservice.repository.ResourceProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Service("resourceProject")
public class ResourceProjectServiceImpl extends BaseServiceImpl<ResourceProject> implements ResourceProjectService {

    @Autowired
    ResourceProjectRepository resourceProjectRepository;

    @Override
    public List<ResourceProject> findByProjectId(UUID p_id) {
        List<ResourceProject> resourceProjects = (List<ResourceProject>) resourceProjectRepository.findByProjectId(p_id);
        return resourceProjects;

    }


    @Override
    public boolean existsByProjectId(UUID id) {
//        resourceProjectRepository.deleteAll();
        if (resourceProjectRepository.existsByProjectId(id)) {
            return true;

        }
        return false;
    }


    @Override
    public void deleteAll(){
        resourceProjectRepository.deleteAll();
    }

    @Override
    public void deleteByProjectId(UUID id){
        resourceProjectRepository.deleteByProjectId(id);
    }


}
