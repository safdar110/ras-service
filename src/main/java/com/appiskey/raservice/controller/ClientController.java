package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 2/5/19.
 */

@RestController
@RequestMapping("/api/ras/v1")
public class ClientController extends BaseController {

    @Autowired
    ClientService clientService;

    @GetMapping("/client/list")
    public Iterable<Client> list() {
        return clientService.getAllClients();
    }


    @PostMapping("/client/create")
    public Client create(@Valid @RequestBody Client client) {
        return clientService.createClient(client);
    }

    @GetMapping("/client/list/{uuid}")
    @ResponseBody
    public Optional<Client> retrieveClient(@PathVariable("uuid") UUID id) {
        return clientService.retrieveClient(id);

    }

    @PostMapping("/client/delete/{uuid}")
    @ResponseBody
    public String deleteID(@PathVariable("uuid") UUID id)
    {
       clientService.deleteClient(id);
        return"{Response : Deleted }";
    }


    @PutMapping("/client/update/{clientID}")
    @ResponseBody
    public ResponseEntity<Object> editClient(@RequestBody Client client, @PathVariable("clientID") UUID id) {
        return clientService.editClient(client,id);
    }


}
