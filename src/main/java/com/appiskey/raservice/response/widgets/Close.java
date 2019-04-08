package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Close {
    private String label;
    private _Count count;
    private Chart chart;

    public Close(){
        this.setLabel("CLOSED");
        this.setCount(new _Count(26,31,27));
        this.setChart(new Chart());
    }



}
