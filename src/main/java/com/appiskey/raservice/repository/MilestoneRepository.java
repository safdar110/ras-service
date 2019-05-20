package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Milestone;
import com.appiskey.raservice.projection.MilestoneRevenueOverdueThisMonth;
import com.appiskey.raservice.projection.MilestoneTotalDelivery;
import com.appiskey.raservice.projection.MilestoneTotalRevenueThisMonth;
import org.springframework.data.jpa.repository.Query;

public interface MilestoneRepository extends BaseRepository<Milestone>{

    @Query("SELECT COUNT(*) as totalDelivery FROM Milestone WHERE milestoneDelieveryDate = CURRENT_DATE")
    MilestoneTotalDelivery findCountTotalDelivery();

    @Query(nativeQuery = true,value="SELECT COALESCE(SUM(milestone_expected_payment),0.00) as totalRevenueThisMonth from milestone m JOIN project_project_milestones pm ON m.id = pm.project_milestones_id JOIN project p ON p.id = pm.project_id where EXTRACT(MONTH FROM m.milestone_delievery_date) = EXTRACT(MONTH FROM CURRENT_DATE) AND EXTRACT(YEAR FROM m.milestone_delievery_date) =EXTRACT(YEAR FROM CURRENT_DATE) AND flag =1")
    MilestoneTotalRevenueThisMonth finTotalRevenueThisMoth();

    @Query(nativeQuery =true, value= "SELECT COALESCE(SUM(milestone_cost),0.00) as overdueRevenueThisMonth from milestone m where EXTRACT(MONTH FROM m.milestone_delievery_date) = EXTRACT(MONTH FROM CURRENT_DATE) AND EXTRACT(YEAR FROM m.milestone_delievery_date) =EXTRACT(YEAR FROM CURRENT_DATE) AND flag =0")
    MilestoneRevenueOverdueThisMonth findRevenueOverdueThisMonth();


}

// select EXTRACT(MONTH from createdAt  )