package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class TotalBudget {
    private String title;
    private String count;
    public TotalBudget(){

        this.setTitle("TOTAL BUDGET");
        this.setCount("124.000,00");
    }


}
