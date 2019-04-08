package com.appiskey.raservice.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.xml.ws.Response;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "resource_project")
@Data
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EqualsAndHashCode
//@EqualsAndHashCode(callSuper = true, exclude = {"project", "resource"})
//@IdClass(ResourceProjectId.class)
public class ResourceProject implements Serializable{


    @Id
    @ManyToOne
    @JoinColumn
    private Resource resource;

    @Id
    @ManyToOne
    @JoinColumn
    private Project project;

//
//
//    @ManyToOne
//    @PrimaryKeyJoinColumn(name = "resourceId", referencedColumnName = "id")
//    private Resource resource;
//
//    @ManyToOne
//    @PrimaryKeyJoinColumn(name = "projectId", referencedColumnName = "id")
//    private Project project;



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