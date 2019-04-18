package com.appiskey.raservice.response.widgets;

@lombok.Data
public class OpenIssue {
    private String title;
    private Data data;
    private String detail;

    public OpenIssue() {
        this.setTitle("Issues");
        this.setData(new Data("OPEN",32,new Extra("Closed today",0)));
        this.setDetail("You can show some detailed information about this widget in here.");
    }
}
