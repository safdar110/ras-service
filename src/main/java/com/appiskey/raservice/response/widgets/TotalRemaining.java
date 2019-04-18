package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class TotalRemaining {
    private String title;
    private String  count;

    public TotalRemaining(){
        this.setTitle("TOTAL BUDGET");
        this.setCount("124.000,00");
    }
}
