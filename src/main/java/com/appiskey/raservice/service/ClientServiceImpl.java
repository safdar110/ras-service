package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Iterable<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);

    }

    @Override
    public Optional<Client> getClientByID(UUID id){

        return clientRepository.findById(id);

    }

    @Override
    public ResponseEntity<Client> deleteClient(Client client){
        Optional<Client> mClient = clientRepository.findById(client.getId());
        if (!mClient.isPresent())
            return ResponseEntity.notFound().build();
        //skill.setId();
        clientRepository.delete(client);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Client> editClient(@RequestBody Client client) {
        Optional<Client> mClient = clientRepository.findById(client.getId());
        if (!mClient.isPresent())
            return ResponseEntity.notFound().build();
        client.setCreatedAt(mClient.get().getCreatedAt());

        return new ResponseEntity<>(clientRepository.save(client),HttpStatus.OK);
    }
    @Override
    public Iterable<Client> searchClient(String keyword){
        Iterable<Client> client = clientRepository.findByClientNameContainingIgnoreCase(keyword);
        return client;
    }

}
