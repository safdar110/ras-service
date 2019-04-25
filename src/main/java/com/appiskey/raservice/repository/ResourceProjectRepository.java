package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.ResourceProject;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public interface ResourceProjectRepository extends BaseRepository<ResourceProject> {


   // @Query("select p from ResourceProject p where projectId = :id")
    List<ResourceProject> findByProjectId(UUID id);



    boolean existsByProjectId(UUID id);

    @Transactional
    @Modifying
    @Query("DELETE FROM ResourceProject WHERE  project.id =  :projectId")
    void deleteByProjectId(@Param("projectId") UUID projectId);


    @Transactional
    @Modifying
    @Query("delete from ResourceProject")
    void deleteAll();


}


