package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Fixed {
    private String label;
    private _Count count;
    private Chart chart;


    public Fixed(){
        this.setLabel("FIXED");
      this.setCount(new _Count(14, 17, 21));
        this.setChart(new Chart());
    }

}
