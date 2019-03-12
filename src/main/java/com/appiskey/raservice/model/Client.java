package com.appiskey.raservice.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
public class Client extends BaseModel{

//    private String clientName;
    private String clientPhoneNumber;
    private String clientEmail;
    private String clientSocial;
    private String clientLocation;
    private String clientWebUrl;
    private String clientAddress;
    private String clientImageUrl;
    private String clientTimeZone;
    private String clientAvailability;
    private Boolean isActive;


    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company clientCompanyName;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    protected Client parent;
//
//    @OneToMany(mappedBy = "parent")
//    protected Set<Client> children;

}
