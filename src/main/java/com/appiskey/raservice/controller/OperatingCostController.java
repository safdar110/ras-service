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

public class OperatingCostController extends  BaseController<OperatingCostService, OperatingCost> {




}
