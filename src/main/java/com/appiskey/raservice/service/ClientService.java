package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.model.Department;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 1/31/19.
 */
public interface ClientService {

    public Client createClient(Client client);
    public Iterable<Client> getAllClients();
    public Optional<Client> retrieveClient(UUID id);
    public String deleteClient(UUID id);
    public ResponseEntity<Object> editClient(Client client, UUID id);

}
