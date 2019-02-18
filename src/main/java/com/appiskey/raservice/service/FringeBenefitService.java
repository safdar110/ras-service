package com.appiskey.raservice.service;

import com.appiskey.raservice.model.FringeBenefit;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface FringeBenefitService {
    public FringeBenefit createFringeBenefit(FringeBenefit fringeBenefit);

    public Iterable<FringeBenefit> getAllFringeBenefits();

    public Optional<FringeBenefit> getFringeBenefitByID(UUID id);

    public Boolean deleteFringeBenefit(UUID id);

    public ResponseEntity<FringeBenefit> editFringeBenefit(FringeBenefit fringeBenefit);
//    public Iterable<FringeBenefit> searchFringeBenefit(String keyword);
}
