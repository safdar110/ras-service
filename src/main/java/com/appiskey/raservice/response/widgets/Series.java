package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Series {
    private String name;
    private int value;

    public Series(){


        this.setName("");
        this.setValue(2);
    }

}
