package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.OperatingCost;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface OperatingCostRepository extends PagingAndSortingRepository<OperatingCost, UUID> {
    Iterable<OperatingCost> findByMonthlyCostContaining(String keyword);

}
