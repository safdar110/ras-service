package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class FooterLeft {
    private String title;
    private _Count count;

    public FooterLeft(){
        this.setTitle("Tasks Added");
        this.setCount(new _Count(594, 526,  487));
    }
}
