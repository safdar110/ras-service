package com.appiskey.raservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@EqualsAndHashCode
@Data
@NoArgsConstructor

public class ResourceProjectId implements Serializable{

    @Column(name = "resource_id")
    private Long  resourceId;

    @Column(name = "project_id")
    private Long projectId;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        ResourceProjectId that = (ResourceProjectId) o;
//
//        if (!resourceId.equals(that.resourceId)) return false;
//        return projectId.equals(that.projectId);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = resourceId.hashCode();
//        result = 31 * result + projectId.hashCode();
//        return result;
//    }
}

