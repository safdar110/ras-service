package com.appiskey.raservice.response.widgets;

@lombok.Data
public class ProposalFeature {

    private String title;
    private Data data;
    private String detail;

    public ProposalFeature(){
        this.setTitle("Features");
     this.setData(new Data("PROPOSALS", 42, new Extra("Implemented", 8)));
        this.setDetail("You can show some detailed information about this widget in here.");
    }


}
