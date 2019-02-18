package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.FringeBenefit;
import com.appiskey.raservice.service.FringeBenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
@RestController
@RequestMapping(value = "${app.url}" + "/fringebenefit")

public class FringeBenefitContoller {

    @Autowired
    FringeBenefitService fringeBenefitService;

    @GetMapping
    public Iterable<FringeBenefit> getAllFringeBenefits(){

        return fringeBenefitService.getAllFringeBenefits();
    }

    @PostMapping
    public FringeBenefit addFringeBenefit(@Valid @RequestBody FringeBenefit fringeBenefit){
        return fringeBenefitService.createFringeBenefit(fringeBenefit);
    }

    @GetMapping("/{uuid}")
    @ResponseBody
    public Optional<FringeBenefit> getFringeBenefitByID(@PathVariable("uuid") UUID id) {
        return fringeBenefitService.getFringeBenefitByID(id);

    }

    @DeleteMapping("{id}")
    public Boolean deleteOperatingCost(@PathVariable UUID id) {
        return fringeBenefitService.deleteFringeBenefit(id);
    }

    @PutMapping
    @ResponseBody
    public ResponseEntity<FringeBenefit> editFringeBenefit(@RequestBody FringeBenefit fringeBenefit) {
        return fringeBenefitService.editFringeBenefit(fringeBenefit);
    }

//    @PostMapping("/search")
//    public Iterable<FringeBenefit> findOperatingCostByName(@RequestBody Map<String, BigDecimal> body){
//        return  fringeBenefitService.searchOperatingCost(body.get("keyword").toString());
//    }


}
