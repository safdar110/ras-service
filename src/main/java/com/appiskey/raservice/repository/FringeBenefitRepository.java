package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.FringeBenefit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface FringeBenefitRepository  extends BaseRepository<FringeBenefit> {


    @Query("SELECT Sum(expenseAmount) FROM  FringeBenefit")
    public double findTotalExpense();
}