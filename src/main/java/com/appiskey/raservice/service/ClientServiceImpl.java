package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 1/31/19.
 */
@Service("clientService")
public class ClientServiceImpl extends BaseServiceImpl<ClientRepository,Client> implements ClientService{
    @Override
    public Iterable<Client> searchByName(String keyword) {
        return repository.findByClientNameContainingIgnoreCase(keyword);
    }
}
