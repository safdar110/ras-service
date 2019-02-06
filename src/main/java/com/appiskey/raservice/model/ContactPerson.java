package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by appiskey on 2/4/19.
 */

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table
public class ContactPerson extends BaseModel {


    private String clientFullName;
    private String clientEmail;
    private String clientPhoneNumber;
    private String imName;
    private Boolean isPrimary = true;

    @ManyToOne
    @JoinColumn(name= "client_id")
    private Client client;

}
