package com.appiskey.raservice.service;

import com.appiskey.raservice.model.FringeBenefit;
import com.appiskey.raservice.projection.TotalExpense;
import com.appiskey.raservice.repository.FringeBenefitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */

@Service("FringeBenefitService")
public class FringeBenefitServiceImpl extends BaseServiceImpl<FringeBenefit> implements FringeBenefitService{

    @Autowired
    FringeBenefitRepository fringeBenefitRepository;


@Override
public TotalExpense findTotalExpense(){
    return fringeBenefitRepository.findTotalExpense();

}

}
