package com.appiskey.raservice.projection;

import java.util.Date;

public interface ProjectDetail {
    String getProjectName();
    Double getProjectCost();
    Double getProjectTimeline();
    String getCurrentMilestone();
    Date getCurrentMilestoneDeliveryDate();
    Double getPercentCompleted();


}
