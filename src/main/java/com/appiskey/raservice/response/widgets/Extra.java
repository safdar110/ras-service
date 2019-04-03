package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Extra {
    private String label;
    private Count countObj;
    private int count;



    public Extra(String label, int count) {
        this.label = label;
        this.count = count;
    }


    public Extra(String label, Count count) {
        this.label = label;
        this.countObj =  count;
    }

}
