package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class ReOpen {
    private String label;
    private _Count count;
    private Chart chart;
    public ReOpen(){
        this.setLabel("RE-OPENED");
        this.setCount(new _Count(2, 5, 4));
        this.setChart(new Chart());
    }
}
