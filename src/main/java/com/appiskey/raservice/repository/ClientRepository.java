package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Client;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by suraksha-pnc on 2/7/19.
 */
public interface ClientRepository extends BaseRepository<Client> {

    @Query("SELECT COUNT(*) FROM Client")
    Integer findCountDistinct();
}
