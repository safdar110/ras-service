package com.appiskey.raservice.response.widgets;



@lombok.Data
public class Data {
    private String label;
    private Count countObj;
    private  int count;
    private Extra extra;
//
//    public Data(){
//        this.setLabel("");
//        this.setCountObj(new Count());
//        this.setCount(2);
//        this.setExtra(new Extra());
//    }

    public Data(String label, Count count, Extra extra){
        this.label = label;
        this.countObj = count;
        this.extra = extra;
    }

    public Data(String label, int count, Extra extra){
        this.label = label;
        this.count = count;
        this.extra = extra;
    }


}
