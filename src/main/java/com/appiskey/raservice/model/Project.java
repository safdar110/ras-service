package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
public class Project extends BaseModel{

    private String projectName;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client projectClient;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "project_feature",
            joinColumns = @JoinColumn(name = "feature_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id",
                    referencedColumnName = "id"))
    private List<Feature> projectFeatures;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "project_resource",
            joinColumns = @JoinColumn(name = "resource_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id",
                    referencedColumnName = "id"))
    private List<Resource> projectResources;


    private LocalDateTime projectStartDate;
    private LocalDateTime projectEndDate;
}
