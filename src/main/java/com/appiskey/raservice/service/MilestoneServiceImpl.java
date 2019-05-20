package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Milestone;
import com.appiskey.raservice.projection.MilestoneRevenueOverdueThisMonth;
import com.appiskey.raservice.projection.MilestoneTotalDelivery;
import com.appiskey.raservice.projection.MilestoneTotalRevenueThisMonth;
import com.appiskey.raservice.repository.MilestoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MilestoneService")
public class MilestoneServiceImpl extends BaseServiceImpl<Milestone> implements MilestoneService {

    @Autowired
    MilestoneRepository milestoneRepository;

    @Override
    public MilestoneTotalDelivery findCountTotalDelivery() {

        return milestoneRepository.findCountTotalDelivery();
    }

    @Override
    public MilestoneTotalRevenueThisMonth finTotalRevenueThisMoth() {

        return milestoneRepository.finTotalRevenueThisMoth();
    }


    @Override
    public MilestoneRevenueOverdueThisMonth findRevenueOverdueThisMonth() {

        return milestoneRepository.findRevenueOverdueThisMonth();
    }
}

