package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by appiskey on 2/4/19.
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
public class Milestone extends BaseModel {

//    private String milestoneName;
    private Date milestoneStartDate;
    private Date milestoneDelieveryDate;
    private Date milestoneDevelopmentDate;
    private BigDecimal milestoneExpectedPayment;
    private BigDecimal milestonePaymentAmount;
    private BigDecimal milestoneCost;
    private String milestonePaymentMethod;


//    @ManyToOne
//    private Client client;


    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id")
    private Project project;


 }
