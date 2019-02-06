package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by appiskey on 2/4/19.
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
public class ProjectType extends BaseModel {

    private String typeName;


}
