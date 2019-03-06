package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.Duration;
import java.util.List;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
public class Feature extends BaseModel {
//    private String featureName;
    private float featureEstimateDuration;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "project_id")
//    private List<Project> featureProjects;


//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "feature_skill",
//            joinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "feature_id",
//                    referencedColumnName = "id"))
//    private List<Skill> featureSkills;
}
