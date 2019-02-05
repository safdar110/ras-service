package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by khawar on 2/5/19.
 */

@RestController
@RequestMapping("/client")
public class ClientController extends BaseController {

    @Autowired
    ClientService clientService;

    @GetMapping("/list")
    public Iterable<Client> list() {
        return clientService.getAllClients();
    }


}
