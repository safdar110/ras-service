package com.appiskey.raservice.response.widgets;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ThisWeek {
    private String name;
    private List<Series> series;
    private int value;

    public ThisWeek(){
        this.setName("");
        this.setSeries(new ArrayList<>());

    }

    }


