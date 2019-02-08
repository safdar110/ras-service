package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by suraksha-pnc on 2/6/19.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
public class FringeBenefit extends BaseModel {

    private String benefitMonth;
    private String expenseName;
    private BigDecimal expenseAmount;
    private Boolean isOneTime;

//    @ManyToMany
//    private List<Department> benefitDepartment;
//
//    @ManyToMany
//    private List<Resource> benefitResource;

}
