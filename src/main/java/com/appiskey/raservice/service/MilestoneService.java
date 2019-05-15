package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Milestone;
import com.appiskey.raservice.projection.MilestoneRevenueOverdueThisMonth;
import com.appiskey.raservice.projection.MilestoneTotalDelivery;
import com.appiskey.raservice.projection.MilestoneTotalRevenueThisMonth;

public interface MilestoneService extends BaseService<Milestone> {
    public MilestoneTotalDelivery findCountTotalDelivery();
    public MilestoneTotalRevenueThisMonth finTotalRevenueThisMoth();

   public MilestoneRevenueOverdueThisMonth findRevenueOverdueThisMonth();
}
