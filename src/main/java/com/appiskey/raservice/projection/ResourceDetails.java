package com.appiskey.raservice.projection;

public interface ResourceDetails {
    String getResourcename();
    Double getResourceFree();
    Double getResourceOccupied();
    Integer getTotalProjects();
    Double getRevenuePerResource();
}
