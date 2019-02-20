package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Resource;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface ResourceService  {
    public Resource createResource(Resource resource);
    public Iterable<Resource> getAllResources();
    public Optional<Resource> getResourceByID(UUID id);
    public Boolean deleteResource(UUID id);
    public ResponseEntity<Resource> editResource(Resource resource);

}
