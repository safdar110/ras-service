package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Test {
    private String label;
    private _Count count;
    private Chart chart;
    public Test(){
        this.setLabel("NEEDS TEST");
     this.setCount(new _Count(8, 7, 10));
        this.setChart(new Chart());
    }

}
