package com.appiskey.raservice.response.widgets;

import lombok.Data;

import java.util.*;

@Data
public class Schedulee {

private List<Today> today;
private List<Tomorrow> tomorrow;

    public Schedulee() {
//        List<Today> today = new ArrayList<>();
//        today.add();
       // Schedule schedule  = new Schedule();


        Today today1 = new Today();
        ArrayList<Today> todayList = new ArrayList<Today>();
        today1.setTitle("Group Meeting");
        today1.setTime("In 32 minutes");
        today1.setLoaction("Room 1B");
        todayList.add(today1);

        Today today2 = new Today();
        today2.setTitle("Coffee Break");
        today2.setTime("10:30 AM");
        today2.setLoaction("Room 1A");
        todayList.add(today2);

        Today today3 = new Today();
        today3.setTitle("Public Beta Release");
        today3.setTime("11:00 AM");
        today3.setLoaction("Room 1B");
        todayList.add(today3);


        Today today4 = new Today();
        today4.setTitle("Lunch");
        today4.setTime("12:10 PM");
        today4.setLoaction("Room 1B");
        todayList.add(today4);


        Today today5 = new Today();
        today5.setTitle("Dinner with David");
        today5.setTime("17:30 PM");
        today5.setLoaction("Room 1B");
        todayList.add(today5);


        Today today6 = new Today();
        today6.setTitle("Jane\\'s Birthday Party");
        today6.setTime("19:30 PM");
        today6.setLoaction("Room 1B");
        todayList.add(today6);



        Today today7 = new Today();
        today7.setTitle("Overseer\\'s Retirement Party");
        today7.setTime("21:30 PM");
        today7.setLoaction("Room 1B");
        todayList.add(today7);


        //Tomorrow List


        Tomorrow tomorrow1 = new Tomorrow();
        ArrayList<Tomorrow> tomorrowList = new ArrayList<Tomorrow>();
        tomorrow1.setTitle("Marketing Meeting");
        tomorrow1.setTime("In 32 minutes");
        tomorrowList.add(tomorrow1);


        Tomorrow tomorrow2 = new Tomorrow();
        tomorrow2.setTitle("Public Announcement");
        tomorrow2.setTime("In 32 minutes");
        tomorrowList.add(tomorrow2);


        Tomorrow tomorrow3 = new Tomorrow();
        tomorrow3.setTitle("Lunch");
        tomorrow3.setTime("In 32 minutes");
        tomorrowList.add(tomorrow3);


        Tomorrow tomorrow4 = new Tomorrow();
        tomorrow4.setTitle("Meeting with Beta Testers");
        tomorrow4.setTime("In 32 minutes");
        tomorrowList.add(tomorrow4);

        Tomorrow tomorrow5 = new Tomorrow();
        tomorrow5.setTitle("Live Stream");
        tomorrow5.setTime("In 32 minutes");
        tomorrowList.add(tomorrow5);

        Tomorrow tomorrow6 = new Tomorrow();
        tomorrow6.setTitle("Release Party");
        tomorrow6.setTime("In 32 minutes");
        tomorrowList.add(tomorrow6);

        Tomorrow tomorrow7 = new Tomorrow();
        tomorrow7.setTitle("CEO\\'s Party");
        tomorrow4.setTime("In 32 minutes");
        tomorrowList.add(tomorrow7);

        this.setToday(new ArrayList<>(todayList));
        this.setTomorrow(new ArrayList<>(tomorrowList));
    }
}
