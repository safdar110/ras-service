package com.appiskey.raservice.service;

import com.appiskey.raservice.model.FringeBenefit;
import com.appiskey.raservice.projection.TotalExpense;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface FringeBenefitService extends BaseService<FringeBenefit> {

    public TotalExpense findTotalExpense();


}
