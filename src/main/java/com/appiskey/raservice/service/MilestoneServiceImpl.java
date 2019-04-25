package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Milestone;
import com.appiskey.raservice.repository.MilestoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MilestoneService")
public class MilestoneServiceImpl extends BaseServiceImpl<Milestone> implements MilestoneService {

    @Autowired
    MilestoneRepository milestoneRepository;

    @Override
    public Integer findCountTotalDelivery() {

        return milestoneRepository.findCountTotalDelivery();
    }

}

