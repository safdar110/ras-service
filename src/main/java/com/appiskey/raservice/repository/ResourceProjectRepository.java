package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.model.ResourceProject;
import com.appiskey.raservice.model.ResourceProjectId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

public interface ResourceProjectRepository extends BaseRepository<ResourceProject> {


   // @Query("select p from ResourceProject p where projectId = :id")
    List<ResourceProject> findByProjectId(UUID id);

    int countDistinctByProjectId(UUID id);
}


