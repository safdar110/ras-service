package com.appiskey.raservice.response.widgets;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Chart {

    private List<ThisWeek> thisWeek;
    private List<LastWeek> lastWeek;
    private List<WeeksAgo> twoWeeksAgo;

    public Chart(){

        WeeksAgo twoWeeksAgo1 = new WeeksAgo();
        ArrayList<WeeksAgo> weeksAgoList = new ArrayList<WeeksAgo>();
        twoWeeksAgo1.setName("CREATED");
        weeksAgoList.add(twoWeeksAgo1);


        Series series1 = new Series();
        ArrayList<Series> seriesList = new ArrayList<Series>();
        series1.setName("Mon");
        series1.setValue(5);
        seriesList.add(series1);


        Series series2 = new Series();
        series2.setName("Tue");
        series2.setValue(8);
        seriesList.add(series2);

        Series series3 = new Series();
        series3.setName("Wed");
        series3.setValue(5);
        seriesList.add(series3);


        Series series4 = new Series();
        series4.setName("Thu");
        series4.setValue(6);
        seriesList.add(series4);


        Series series5 = new Series();
        series5.setName("Fri");
        series5.setValue(7);
        seriesList.add(series2);


        Series series6= new Series();
        series6.setName("Sat");
        series6.setValue(8);
        seriesList.add(series6);


        Series series7 = new Series();
        series7.setName("Sun");
        series7.setValue(7);
        seriesList.add(series7);


        twoWeeksAgo1.setSeries(seriesList);




        ThisWeek thisWeek1 = new ThisWeek();
        ArrayList<ThisWeek> thisWeekList = new ArrayList<ThisWeek>();
        thisWeek1.setName("Created");
        thisWeekList.add(thisWeek1);


        Series series15 = new Series();
        ArrayList<Series> seriesList8 = new ArrayList<Series>();
        series15.setName("Mon");
        series15.setValue(3);
        seriesList8.add(series15);


        Series series16 = new Series();
        series16.setName("Tue");
        series16.setValue(2);
        seriesList8.add(series16);



        Series series17 = new Series();
        series17.setName("Wed");
        series17.setValue(1);
        seriesList8.add(series17);


        Series series18 = new Series();
        series18.setName("Thu");
        series18.setValue(4);
        seriesList8.add(series18);


        Series series19 = new Series();
        series19.setName("Fri");
        series19.setValue(5);
        seriesList8.add(series19);


        Series series20 = new Series();
        series20.setName("Sat");
        series20.setValue(4);
        seriesList8.add(series20);


        Series series21 = new Series();
        series21.setName("Sun");
        series21.setValue(7);
        seriesList8.add(series21);



        thisWeek1.setSeries(seriesList8);


        LastWeek lastWeek1 = new LastWeek();
        ArrayList<LastWeek> lastWeekList = new ArrayList<LastWeek>();
        lastWeek1.setName("Created");
        lastWeekList.add(lastWeek1);


        Series series29 = new Series();
        ArrayList<Series> seriesList15 = new ArrayList<Series>();
        series29.setName("Mon");
        series29.setValue(6);
        seriesList15.add(series29);


        Series series30 = new Series();
        series30.setName("Tue");
        series30.setValue(3);
        seriesList15.add(series30);


        Series series31 = new Series();
        series31.setName("Wed");
        series31.setValue(7);
        seriesList15.add(series31);

        Series series32 = new Series();
        series32.setName("Thu");
        series32.setValue(5);
        seriesList15.add(series32);

        Series series33 = new Series();
        series33.setName("Fri");
        series33.setValue(5);
        seriesList15.add(series33);


        Series series34 = new Series();
        series34.setName("Sat");
        series34.setValue(4);
        seriesList15.add(series34);

        Series series35 = new Series();
        series35.setName("Sat");
        series35.setValue(7);
        seriesList15.add(series35);



        lastWeek1.setSeries(seriesList15);


        this.setThisWeek(new ArrayList<>(thisWeekList));
        this.setLastWeek(new ArrayList<>(lastWeekList));
        this.setTwoWeeksAgo(new ArrayList<>(weeksAgoList));
    }
}
