package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
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

    @ManyToMany
    @JoinTable(name = "project_feature",
            joinColumns = @JoinColumn(name = "feature_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id",
                    referencedColumnName = "id"))
    private List<Feature> projectFeatures;

    @ManyToMany
    @JoinTable(name = "project_resource",
            joinColumns = @JoinColumn(name = "resource_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id",
                    referencedColumnName = "id"))
    private List<Resource> projectResources;

    @OneToMany
    @JoinTable(name = "project_milestone",
            joinColumns = @JoinColumn(name = "milestone_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id",
                    referencedColumnName = "id"))
    private List<Milestone> projectMilestones;

    private Date projectStartDate;
    private Date projectDevelopmentDate;
    private BigDecimal projectCost;
    private String projectTimeline;
    private String projectPaymentMethod;


}
