package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Range {
    private String dy;
    private String dt;
    private String dtm;

    public Range(){
        this.setDy("Yesterday");
        this.setDt("Today");
        this.setDtm("Tomorrow");


    }


    public Range(String dt, String dtm) {
        this.dt = dt;
        this.dtm = dtm;
    }

    private String thisWeek;
    private String lastWeek;
    private String twoWeeks;

    public Range(String thisWeek, String lastWeek, String twoWeeks){
        this.thisWeek = thisWeek;
        this.lastWeek = lastWeek;
        this.twoWeeks = twoWeeks;
    }
}