package com.appiskey.raservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
    private BigDecimal milestoneExpectedPayment;
    private int milestoneNoOfDays;
    private BigDecimal milestoneCost;



//    @ManyToOne
//    private Client client;

//
//    @ManyToOne
//    @JoinColumn(name = "project_id", referencedColumnName = "id")


//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "project_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    private Project project;


 }
