package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.projection.ClientCount;
import com.appiskey.raservice.projection.ClientsAddedThisMonth;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 1/31/19.
 */
public interface ClientService extends BaseService<Client>{
//    public Iterable<Client> searchByName(String keyword);

    public ClientCount findCountDistinct();

    public ClientsAddedThisMonth findClientsAddedThisMonth();

}
