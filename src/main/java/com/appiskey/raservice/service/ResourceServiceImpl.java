package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Resource;
import com.appiskey.raservice.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
@Service("ResourceService")
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    ResourceRepository resourceRepository;

    @Override
    public Iterable<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    @Override
    public Resource createResource(Resource resource) {
        return resourceRepository.save(resource);

    }

    @Override
    public Optional<Resource> getResourceByID(UUID id){

        return resourceRepository.findById(id);

    }

    @Override
    public ResponseEntity<Resource> deleteResource(Resource resource){
        Optional<Resource> mResource = resourceRepository.findById(resource.getId());
        if (!mResource.isPresent())
            return ResponseEntity.notFound().build();
        //skill.setId();
        resourceRepository.delete(resource);
        return new ResponseEntity<>(resource, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Resource> editResource(@RequestBody Resource resource) {
        Optional<Resource> mResource = resourceRepository.findById(resource.getId());
        if (!mResource.isPresent())
            return ResponseEntity.notFound().build();
        resource.setCreatedAt(mResource.get().getCreatedAt());

        return new ResponseEntity<>(resourceRepository.save(resource),HttpStatus.OK);
    }
}
