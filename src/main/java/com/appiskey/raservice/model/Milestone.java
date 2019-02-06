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

    private String milestoneName;
    private LocalDateTime milestoneStartDate;
    private LocalDateTime milestoneEndDate;
    private BigDecimal milestoneExpectedPayment;


//    private Client client;

    @OneToOne
    @JoinColumn(name = "project_type_id", referencedColumnName = "id")
    private ProjectType projectType;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "pid", referencedColumnName = "id")
//    private Project project;
}
