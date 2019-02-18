package com.appiskey.raservice.service;

import com.appiskey.raservice.model.OperatingCost;
import com.appiskey.raservice.repository.OperatingCostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by suraksha-app on 2/14/19.
 */
@Service("OperatingCostService")
public class OperatingCostServiceImpl implements OperatingCostService {

    @Autowired
    OperatingCostRepository operatingCostRepository;

    @Override
    public Iterable<OperatingCost> getAllOperatingCosts() {
        return operatingCostRepository.findAllByDeleted(false);
    }

    @Override
    public OperatingCost createOperatingCost(OperatingCost operatingCost) {
        return operatingCostRepository.save(operatingCost);

    }

    @Override
    public Optional<OperatingCost> getOperatingCostByID(UUID id){

        return operatingCostRepository.findById(id);

    }
    @Override
    public Boolean deleteOperatingCost(UUID id) {
        OperatingCost operatingCost;
        Optional<OperatingCost> operatingCostOptional = operatingCostRepository.findById(id);//  findOne(id);
        if (operatingCostOptional.isPresent()) {
            operatingCost = operatingCostOptional.get();
            operatingCost.setDeleted(true);
            operatingCostRepository.save(operatingCost);
            return true;
        } else {

            return false;
        }





    }

    @Override
    public ResponseEntity<OperatingCost> editOperatingCost(@RequestBody OperatingCost operatingCost) {
        Optional<OperatingCost> mOperatingCost = operatingCostRepository.findById(operatingCost.getId());
        if (!mOperatingCost.isPresent())
            return ResponseEntity.notFound().build();
        operatingCost.setCreatedAt(mOperatingCost.get().getCreatedAt());

        return new ResponseEntity<>(operatingCostRepository.save(operatingCost),HttpStatus.OK);
    }
    @Override
    public Iterable<OperatingCost> searchOperatingCost(String keyword){
        Iterable<OperatingCost> operatingCost =operatingCostRepository.findByMonthlyCostContaining(keyword);
        return operatingCost;
    }
}
