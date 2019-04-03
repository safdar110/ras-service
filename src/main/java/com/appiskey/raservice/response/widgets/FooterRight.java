package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class FooterRight {
    private String title;
    private _Count count;

    public FooterRight(){
        this.setTitle("Tasks Completed");
        this.setCount(new _Count(193, 260, 287));
    }


}
