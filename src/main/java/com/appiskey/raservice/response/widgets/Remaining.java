package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Remaining {
    private String title;
    private Count count;
    private Chart chart;

    public Remaining(){
        this.setTitle("REMAINING");
        this.setCount(new Count("89.241,66","92.871,81","94.317,15" ));
        this.setChart(new Chart());

    }

}
