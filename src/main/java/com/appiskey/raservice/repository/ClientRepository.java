package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.projection.ClientCount;
import com.appiskey.raservice.projection.ClientsAddedThisMonth;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
public interface ClientRepository extends BaseRepository<Client> {

    @Query("SELECT COUNT(*) as count FROM Client")
    ClientCount findCountDistinct();


    @Query("SELECT count(*) as count from Client where EXTRACT(MONTH FROM createdAt) = EXTRACT(MONTH FROM CURRENT_DATE) AND EXTRACT(YEAR FROM createdAt) =EXTRACT(YEAR FROM CURRENT_DATE)")
    ClientsAddedThisMonth findClientsAddedThisMonth();



}
