package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.OperatingCost;
import com.appiskey.raservice.service.OperatingCostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/operatingcost")

public class OperatingCostController {

    @Autowired
    OperatingCostService operatingCostService;

    @GetMapping
    public Iterable<OperatingCost> getAllOperatingCosts(){

        return operatingCostService.getAllOperatingCosts();
    }

    @PostMapping
    public OperatingCost addOperatingCost(@Valid @RequestBody OperatingCost operatingCost){
        return operatingCostService.createOperatingCost(operatingCost);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Optional<OperatingCost> getOperatingCostByID(@PathVariable("uuid") UUID id) {
        return operatingCostService.getOperatingCostByID(id);

    }

    @DeleteMapping
    @ResponseBody
    public ResponseEntity<OperatingCost> deleteOperatingCost(@RequestBody OperatingCost operatingCost)
    {

        return operatingCostService.deleteOperatingCost(operatingCost);
    }


    @PutMapping
    @ResponseBody
    public ResponseEntity<OperatingCost> editOperatingCost(@RequestBody OperatingCost operatingCost) {
        return operatingCostService.editOperatingCost(operatingCost);
    }

    @PostMapping("/search")
    public Iterable<OperatingCost> findOperatingCostByName(@RequestBody Map<String, BigDecimal> body){
        return  operatingCostService.searchOperatingCost(body.get("keyword").toString());
    }



}
