package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.Entity;
import javax.persistence.Table;


@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
public class Company extends BaseModel {
}
