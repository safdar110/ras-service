package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Tomorrow {
    private String title;
    private String time;

    public Tomorrow(){
        this.setTitle("");
        this.setTime("");


    }

}
