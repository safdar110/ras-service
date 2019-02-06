package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by suraksha-pnc on 2/6/19.
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
public class OperatingCost extends BaseModel{

    private BigDecimal monthlyCost;

}
