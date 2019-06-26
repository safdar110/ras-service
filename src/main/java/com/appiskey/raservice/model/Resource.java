package com.appiskey.raservice.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resource extends BaseModel{


    private Long resourceId;
    private String resourceCNIC;
    private String resourceDOB;
    private String resourceEmail;
    private String resourceAddress;
    private String resourcePhone;
    private String resourceReligion;
    private String resourceBloodGroup;
    private String resourceNationality;
    private String resourceEmergencyContactNo;
    private String resourceMaritalStatus;
    private String resourceResume;
    private Date resourceDateOfJoining;
    private int resourceWorkingDays;
    private float resourceExperience;
    private BigDecimal resourceSalaryPerMonth;
    private BigDecimal resourcePerHourRate;
    private String resourceShift;
    private String resourceBenefits;
    private String resourceEmployeeType;     //isIntern, isPartTime , isFullTime
    private String resourceJobType;     //isIntern, isPartTime , isFullTime



    @ManyToOne
    @JoinColumn(name="designation_id")
    private Designation resourceDesignation;



    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "resource_skill",
            joinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "resource_id",
                    referencedColumnName = "id"))
    private Set<Skill> resourceSkills;



    @OneToMany(mappedBy = "resource", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<ResourceProject> resourceProjectsList;

//    @ManyToOne
//    @JoinColumn(name="resourceId")
//    @JsonIgnore
//    private ResourceProject resourceProject;

    private boolean resourcePartTime;


    @ManyToOne
    @JoinColumn(name="department_id")
//    @JsonIgnore
    private Department resourceDepartment;


    @ManyToOne
    @JoinColumn(name = "reporting_id")
    protected Resource resourceReportingTo;
}
