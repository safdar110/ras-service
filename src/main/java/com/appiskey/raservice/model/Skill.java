package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
public class Skill extends BaseModel {

//    private String skillName;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinColumn(name = "resource_id")
//    private List<Resource> skillResources;
}
