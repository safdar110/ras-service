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
    public Optional<Client> getClientByID(UUID id);
    public ResponseEntity<Client> deleteClient(Client client);
    public ResponseEntity<Client> editClient(Client client);
    public Iterable<Client> searchClient(String keyword);

}
