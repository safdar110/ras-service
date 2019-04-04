package com.appiskey.raservice.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "resource_project")
@Data
public class ResourceProject{

//    @EmbeddedId
//    private ResourceProjectId resourceProjectId;

    @EmbeddedId
    private ResourceProjectId resourceProjectId;

    @ManyToOne
    @MapsId("resourceId")
    private Resource resource;

    @ManyToOne
    @MapsId("projectId")
    private Project project;

    @Column
    private String resourceProjectHour;

    @Column
    private String resourceProjectAllocation;

    @Column
    private String resourceProjectWorkStartDate;

    @Column
    private String resourceProjectWorkEndDate;

}