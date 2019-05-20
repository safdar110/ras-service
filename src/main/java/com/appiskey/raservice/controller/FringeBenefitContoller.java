package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.FringeBenefit;
import com.appiskey.raservice.projection.TotalExpense;
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

public class FringeBenefitContoller extends BaseController<FringeBenefitService, FringeBenefit>{


    @GetMapping("/total-expense")
    public TotalExpense findTotalExpense(){
        return service.findTotalExpense();

    }

}
