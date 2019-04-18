package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Row {
    private String value;
    private String classes;
    private String icon;
    private String avatar;
    private String name;
    private String position;
    private String office;
    private String email;
    private String phone;

    public Row(){
        this.setName("");
        this.setValue("");
        this.setAvatar("");
        this.setIcon("");
        this.setClasses("");
        this.setPosition("");
        this.setOffice("");
        this.setEmail("");
        this.setPhone("");
    }


}
