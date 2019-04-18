package com.appiskey.raservice.response.widgets;

import lombok.Data;
import org.springframework.scheduling.support.ScheduledMethodRunnable;

@Data
public class Schedule {
    private String title;
    private Range ranges;
    private Schedulee schedule;

    public Schedule(){
        this.setTitle("Schedule");
        this.setRanges(new Range("Today","Tomorrow"));
        this.setSchedule(new Schedulee());
    }

}
