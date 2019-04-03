package com.appiskey.raservice.response.widgets;

@lombok.Data
public class DueTask {
    private Range ranges;
    private String currentRange;
    private Data data;
    private String detail;

    public DueTask(){
        this.setRanges(new Range());
        this.setCurrentRange("dt");
        this.setData(new Data("Due Tasks", new Count(21, 25, 19), new Extra("Completed", new Count(6, 7))));
        this.setDetail("You can show some detailed information about this widget in here.");
    }
}
