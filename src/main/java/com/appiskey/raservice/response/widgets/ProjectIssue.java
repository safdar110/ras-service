package com.appiskey.raservice.response.widgets;

import lombok.Data;

import java.util.List;

@Data
public class ProjectIssue {
    private String title;
    private Range ranges;
    private MainChart mainChart;
    private Support supporting;

    public ProjectIssue(){
        this.setTitle("Project Issues");
        this.setRanges(new Range("This Week", "Last Week" , "Two Weeks Ago"));
        this.setMainChart(new MainChart());
        this.setSupporting(new Support());
    }



}
