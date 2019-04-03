package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class TotalSpent {
    private String title;
    private Count count;
    private Chart chart;

    public TotalSpent(){
        this.setTitle("'TOTAL SPENT");
        this.setCount(new Count("34,758.34","31,128.19","29,682.85"));
        this.setChart(new Chart());
    }


}
