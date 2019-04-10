package com.appiskey.raservice.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.xml.ws.Response;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
//@IdClass(ResourceProjectId.class)
public class ResourceProject extends BaseModel implements Serializable{

//    @Id
//    @ManyToOne
//    @JoinColumn
//    private Project project;
//
//    @Id
//    @ManyToOne
//    @JoinColumn
//    private Resource resource;



//


    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn(name = "resourceId", referencedColumnName = "id")
//    @JoinTable(name = "project_association",
//            joinColumns = @JoinColumn(name = "resourceId", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "projectId",
//                    referencedColumnName = "id"))
    private Resource resource ;

    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.MERGE)
    @PrimaryKeyJoinColumn(name = "projectId", referencedColumnName = "id")
    private Project project;



//    @EmbeddedId
//    ResourceProjectId id;



//    @ManyToOne
//    @MapsId("resource_id")
//    @JoinColumn(name = "resource_id")
//    Resource resource;
//
//    @ManyToOne
//    @MapsId("project_id")
//    @JoinColumn(name = "project_id")
//    Project project;

    @Column
    private String resourceProjectHour;

    @Column
    private String resourceProjectAllocation;

    @Column
    private String resourceProjectWorkStartDate;

    @Column
    private String resourceProjectWorkEndDate;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ResourceProject)) return false;
//        ResourceProject that = (ResourceProject) o;
//        return Objects.equals(book.getName(), that.book.getName()) &&
//                Objects.equals(publisher.getName(), that.publisher.getName()) &&
//                Objects.equals(publishedDate, that.publishedDate);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(book.getName(), publisher.getName(), publishedDate);
//    }
}



//                            JSON Request

//{
//
//        "resource":
//
//        {
//        "id": "439d600c-339a-48a9-9636-0a0a88b3a339"
//        },
//
//
//
//
//        "project":{
//
//        "id": "fc8bfb05-59fb-4a52-9f60-99b02e5ce30b"
//        },
//        "resourceProjectHour":"11",
//        "resourceProjectAllocation":"1"
//
//        }