package com.appiskey.raservice.response.widgets;

@lombok.Data
public class OverdueTask {
    private String title;
    private Data data;
    private String detail;

    public OverdueTask() {
        this.setTitle("Overdue");
        this.setData(new Data("TASKS",4, new Extra("Yesterday\\'s overdue", 2)));
        this.setDetail("You can show some detailed information about this widget in here.");
    }
}
