package com.appiskey.raservice.controller;


import com.appiskey.raservice.model.Milestone;
import com.appiskey.raservice.projection.MilestoneRevenueOverdueThisMonth;
import com.appiskey.raservice.projection.MilestoneTotalDelivery;
import com.appiskey.raservice.projection.MilestoneTotalRevenueThisMonth;
import com.appiskey.raservice.service.MilestoneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "${app.url}" + "/milestone")
public class MilestoneController extends BaseController<MilestoneService, Milestone> {


    @GetMapping("/count")
    public MilestoneTotalDelivery totalDelivery(){
        return service.findCountTotalDelivery();
    }

    @GetMapping("/total-revenue")
    public MilestoneTotalRevenueThisMonth finTotalRevenueThisMoth() {

        return service.finTotalRevenueThisMoth();
    }

    @GetMapping("/overdue-revenue")
    public MilestoneRevenueOverdueThisMonth findRevenueOverdueThisMonth() {

        return service.findRevenueOverdueThisMonth();
    }

}
