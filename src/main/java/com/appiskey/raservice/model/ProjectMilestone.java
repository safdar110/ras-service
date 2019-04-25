package com.appiskey.raservice.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Data
@Getter
@Setter
public class ProjectMilestone {

    private String projectName;

    public ProjectMilestone(String projectName) {
        this.projectName = projectName;
    }
}
