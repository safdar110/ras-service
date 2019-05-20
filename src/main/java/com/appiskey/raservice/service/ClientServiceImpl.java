package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.projection.ClientCount;
import com.appiskey.raservice.projection.ClientsAddedThisMonth;
import com.appiskey.raservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by khawar on 1/31/19.
 */
@Service("clientService")
public class ClientServiceImpl extends BaseServiceImpl<Client> implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public ClientCount findCountDistinct() {

        return clientRepository.findCountDistinct();
    }

    @Override
    public ClientsAddedThisMonth findClientsAddedThisMonth() {

        return clientRepository.findClientsAddedThisMonth();
    }


}
