package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
public class Department extends BaseModel{
    private String departmentName;

//    @OneToMany(mappedBy = "library")
//    private List<Resource> departmentResources;
}
