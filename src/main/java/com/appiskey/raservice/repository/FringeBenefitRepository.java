package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.FringeBenefit;
import com.appiskey.raservice.projection.TotalExpense;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
public interface FringeBenefitRepository  extends BaseRepository<FringeBenefit> {


    @Query("SELECT COALESCE(SUM(expenseAmount),0) as totalExpense FROM  FringeBenefit")
    public TotalExpense findTotalExpense();
}