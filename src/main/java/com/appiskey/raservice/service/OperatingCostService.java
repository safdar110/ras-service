package com.appiskey.raservice.service;

import com.appiskey.raservice.model.OperatingCost;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface OperatingCostService {

    public OperatingCost createOperatingCost(OperatingCost operatingCost);

    public Iterable<OperatingCost> getAllOperatingCosts();

    public Optional<OperatingCost> getOperatingCostByID(UUID id);

    public ResponseEntity<OperatingCost> deleteOperatingCost(OperatingCost operatingCost);
    public ResponseEntity<OperatingCost> editOperatingCost(OperatingCost operatingCost);
    public Iterable<OperatingCost> searchOperatingCost(String keyword);
}
