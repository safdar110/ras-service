package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Today {
    private String title;
    private String time;
    private String loaction;

    public Today(){
        this.setTitle("");
        this.setTime("");
        this.setLoaction("");
    }


}
