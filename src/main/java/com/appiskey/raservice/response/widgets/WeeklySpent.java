package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class WeeklySpent {
    private String title;
    private Count count;
    private Chart chart;

    public WeeklySpent(){
        this.setTitle("' Weekly Spent");
        this.setCount(new Count("3,630.15","1,445.34","2,682.85"));
        this.setChart(new Chart());
    }


}