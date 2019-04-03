package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Create {
    private String label;
    private _Count count;
    private Chart chart;

    public Create(){
        Count count = new Count();
        this.setLabel("CREATED");
        this.setCount(new _Count(54, 46, 48));
        this.setChart(new Chart());

    }

}
