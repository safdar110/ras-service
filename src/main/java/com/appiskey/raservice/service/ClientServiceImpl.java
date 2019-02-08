package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public String deleteClient(UUID id){
        clientRepository.deleteById(id);
        return "Deleted Succesfully!";
    }

    @Override
    public ResponseEntity<Client> editClient(@RequestBody Client client) {
        Optional<Client> mClient = clientRepository.findById(client.getId());
        if (!mClient.isPresent())
            return ResponseEntity.notFound().build();
      //  client.setId(id);
        clientRepository.save(client);
        return ResponseEntity.noContent().build();
    }
    @Override
    public Iterable<Client> searchClient(String keyword){
        Iterable<Client> client = clientRepository.findByClientNameContainingIgnoreCase(keyword);
        return client;
    }

}
