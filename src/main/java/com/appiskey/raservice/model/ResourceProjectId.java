package com.appiskey.raservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ResourceProjectId{

    @Column(name = "resource_id")
    private Integer resourceId;

    @Column(name = "project_id")
    private Integer projectId;

}