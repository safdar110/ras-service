package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class Weather {

    private Location locations;
    private String currentLocation;
    private String tempUnit;
    private  String speedUnit;

}
