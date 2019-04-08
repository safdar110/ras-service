package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Support {
    private Create created;
    private Close closed;
    private  ReOpen reOpened;
    private WontFix wontFix;
    private Test needsTest;
    private Fixed fixed;

    public Support(){
        this.setCreated(new Create());
        this.setClosed(new Close());
        this.setReOpened(new ReOpen());
        this.setWontFix(new WontFix());
        this.setNeedsTest(new Test());
        this.setFixed(new Fixed());
    }

}
