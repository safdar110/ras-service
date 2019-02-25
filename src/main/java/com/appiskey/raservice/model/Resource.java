package com.appiskey.raservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
public class Resource extends BaseModel{
    private String resourceName;
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
    private String resourceDesignation;
    private String resourceResume;
    private Date resourceDateOfJoining;
    private int resourceWorkingDays;
    private float resourceExperience;
    private BigDecimal resourceSalaryPerMonth;
    private BigDecimal resourcePerHourRate;
    private String resourceShift;
    private BigDecimal resourceBenefits;
    private int resourceContractType;     //isIntern, isPartTime , isFullTime



    @ManyToMany
    @JoinTable(name = "resource_skill",
            joinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "resource_id",
                    referencedColumnName = "id"))
    private List<Skill> resourceSkills;

    @ManyToOne
    private Project resourceProject;


    private boolean resourcePartTime;


    @ManyToOne
    @JoinColumn(name="department_id")
    private Department resourceDepartment;


    @ManyToOne
    @JoinColumn(name = "reporting_id")
    protected Resource resourceReportingTo;
}
