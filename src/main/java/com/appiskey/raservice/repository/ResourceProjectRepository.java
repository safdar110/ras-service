package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.model.ResourceProject;
import com.appiskey.raservice.model.ResourceProjectId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceProjectRepository extends JpaRepository<Project, ResourceProjectId> {
}
