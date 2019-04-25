package com.appiskey.raservice.model;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
//@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Project extends BaseModel{
    @ManyToOne
    @JoinColumn(name="client_id")
    private Client projectClient;

    @ManyToMany
    @JoinTable(name = "project_feature",
            joinColumns = @JoinColumn(name = "feature_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "project_id",
                    referencedColumnName = "id"))
    private List<Feature> projectFeatures;

//    @ManyToMany
//    @JoinTable(name = "project_resource",
//            joinColumns = @JoinColumn(name = "resource_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "project_id",
//                    referencedColumnName = "id"))
//    private List<Resource> projectResources;


    @OneToMany(mappedBy = "project" ,fetch =  FetchType.EAGER, cascade ={CascadeType.ALL} )
//    @JsonIgnoreProperties("project")
//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//    @JsonIdentityReference(alwaysAsId = true)
//    @OneToMany(cascade = {CascadeType.REFRESH, CascadeType.MERGE})
//    @JoinColumn(name = "resource_id")
    private List<ResourceProject> resourceProjects;

//    @OneToManyinsert
//    @JoinTable(name = "project_milestone",
//            joinColumns = @JoinColumn(name = "milestone_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "project_id",
//                    referencedColumnName = "id"))

    //    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "post_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)OneToMany

//    @JsonIgnore
    @OneToMany( fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
    private List<Milestone> projectMilestones;

    private Date projectStartDate;
    private Date projectDevelopmentDate;
    private BigDecimal projectCost;
    private int projectTimeline;
    private String projectPaymentMethod;

}
