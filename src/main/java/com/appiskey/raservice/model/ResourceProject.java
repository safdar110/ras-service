package com.appiskey.raservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.ws.Response;
import java.io.Serializable;

@Entity
@Table(name = "resource_project")
@Data
@NoArgsConstructor
//@EqualsAndHashCode(callSuper = true, exclude = {"project", "resource"})
@IdClass(ResourceProjectId.class)
public class ResourceProject{


    @ManyToOne
    @PrimaryKeyJoinColumn(name = "resourceId", referencedColumnName = "id")
    private Resource resource;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "projectId", referencedColumnName = "id")
    private Project project;



//    @EmbeddedId
//    ResourceProjectId id;



//    @ManyToOne
//    @MapsId("resource_id")
//    @JoinColumn(name = "resource_id")
//    Resource resource;
//
//    @ManyToOne
//    @MapsId("project_id")
//    @JoinColumn(name = "project_id")
//    Project project;

    @Column
    private String resourceProjectHour;

    @Column
    private String resourceProjectAllocation;

    @Column
    private String resourceProjectWorkStartDate;

    @Column
    private String resourceProjectWorkEndDate;



}