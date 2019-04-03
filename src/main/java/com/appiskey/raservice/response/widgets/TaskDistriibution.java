package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class TaskDistriibution {

    private String title;
    private Range ranges;
    private _MainChart mainChart;
    private FooterLeft footerLeft;
    private FooterRight footerRight;

    public TaskDistriibution(){
        this.setTitle("Task Distribution");
        this.setRanges(new Range("This Week","Last Week", "Two Weeks Ago"));
        this.setMainChart(new _MainChart());
        this.setFooterLeft(new FooterLeft());
        this.setFooterRight(new FooterRight());

    }

}
