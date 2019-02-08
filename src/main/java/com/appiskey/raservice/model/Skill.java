package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
public class Skill extends BaseModel {
    private String skillName;

    @ManyToMany(mappedBy = "resourceSkills", cascade = CascadeType.PERSIST)
    private List<Resource> skillResources;
}
