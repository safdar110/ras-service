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
public class OperatingCostServiceImpl extends BaseServiceImpl<OperatingCost> implements OperatingCostService {


}
