package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Milestone;
import org.springframework.data.jpa.repository.Query;

public interface MilestoneRepository extends BaseRepository<Milestone>{

    @Query("SELECT COUNT(*) FROM Milestone WHERE milestoneDelieveryDate = CURRENT_DATE")
    Integer findCountTotalDelivery();
}
