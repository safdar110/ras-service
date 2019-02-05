package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;

/**
 * Created by khawar on 1/31/19.
 */
public interface ClientService {

    public Iterable<Client> getAllClients();
    public Client createClient(Client client);
}
