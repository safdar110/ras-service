package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.projection.ClientCount;
import com.appiskey.raservice.projection.ClientsAddedThisMonth;
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
public class ClientController extends BaseController<ClientService, Client> {


    @GetMapping("/count")
    public ClientCount totalClients(){
        return service.findCountDistinct();
    }

    @GetMapping("/clients-this-month")
    public ClientsAddedThisMonth findClientsAddedThisMonth() {

        return service.findClientsAddedThisMonth();
    }

}
