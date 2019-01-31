package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
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
    private String resourceEmail;
    private String resourcePhone;
    private int resourceExperience;
    private BigDecimal resourceSalaryPerMonth;
    private BigDecimal resourcePerHourRate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "resource_skill",
            joinColumns = @JoinColumn(name = "skill_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "resource_id",
                    referencedColumnName = "id"))
    private List<Skill> resourceSkills;

    private String resourceResume;
    private boolean resourcePartTime;

    @ManyToOne
    @JoinColumn(name="department_id")
    private Department resourceDepartment;
}
