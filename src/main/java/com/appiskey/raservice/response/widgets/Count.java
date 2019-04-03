package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Count {
    private int dy;
    private int dt;
    private int dtm;

    private String  thisWeek;
    private String lastWeek;
    private String twoWeeks;


    public Count() {
    }

    public Count(int dy, int dt) {
        this.dy = dy;
        this.dt = dt;
    }
    public Count(int dy, int dt, int dtm) {
        this.dy = dy;
        this.dt = dt;
        this.dtm = dtm;
    }



    public Count(String thisWeek, String lastWeek, String twoWeeks) {
        this.thisWeek = thisWeek;
        this.lastWeek = lastWeek;
        this.twoWeeks = twoWeeks;
    }






}
