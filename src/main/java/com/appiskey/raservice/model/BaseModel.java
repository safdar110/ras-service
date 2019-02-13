package com.appiskey.raservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by khawar on 1/30/19.
 */

@AllArgsConstructor
@NoArgsConstructor


@Getter
@Setter
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class BaseModel {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "pg-uuid", strategy = "pg-uuid")
    @Type(type="pg-uuid")
    protected UUID id;


   @CreationTimestamp
    protected Date createdAt;

    @UpdateTimestamp
    protected Date updatedAt;

    @Column(nullable = false)
    @JsonIgnore
    protected boolean deleted;

    @PrePersist
    protected void onCreate() {
        createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = new Date();
    }
}
