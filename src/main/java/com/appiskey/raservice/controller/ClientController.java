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
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by khawar on 2/5/19.
 */

@RestController
@RequestMapping(value = "${app.url}" + "/client")
public class ClientController extends BaseController {

    @Autowired
    ClientService clientService;

    @GetMapping
    public Iterable<Client> getAllClients() {
        return clientService.getAllClients();
    }


    @PostMapping
    public Client createClient(@Valid @RequestBody Client client) {
        return clientService.createClient(client);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Optional<Client> retrieveClient(@PathVariable("uuid") UUID id) {
        return clientService.getClientByID(id);

    }

    @DeleteMapping
    @ResponseBody
    public ResponseEntity<Client> deleteClientByID(@RequestBody Client client)
    {
     return  clientService.deleteClient(client);

    }


    @PutMapping
    @ResponseBody
    public ResponseEntity<Client> editClient(@RequestBody Client client) {
        return clientService.editClient(client);
    }
    @PostMapping("/search")
    public Iterable<Client> findClientByName(@RequestBody Map<String, String>  body){
        return  clientService.searchClient(body.get("keyword"));
    }


}
