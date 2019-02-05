package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
