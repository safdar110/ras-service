package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class WontFix {
    private String label;
    private _Count count;
    private Chart chart;

    public WontFix(){

        this.setLabel("WON\\'T FIX");
       this.setCount(new _Count(4, 3,  6));
        this.setChart(new Chart());



    }
}
