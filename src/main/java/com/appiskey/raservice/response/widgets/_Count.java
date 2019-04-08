package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class _Count {

    private int thisWeek;
    private int lastWeek;
    private int twoWeeksAgo;

    public _Count (int thisWeek, int lastWeek, int twoWeeksAgo){
        this.thisWeek = thisWeek;
        this.lastWeek = lastWeek;
        this.twoWeeksAgo = twoWeeksAgo;

    }


}
