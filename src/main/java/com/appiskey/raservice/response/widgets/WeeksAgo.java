package com.appiskey.raservice.response.widgets;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class WeeksAgo {
    private String name;
    private List<Series> series;
    private int value;

    public WeeksAgo(){
        this.setName("");
        this.setSeries(new ArrayList<>());
        this.setValue(0);
    }

}
