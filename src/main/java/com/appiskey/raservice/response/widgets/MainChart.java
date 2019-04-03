package com.appiskey.raservice.response.widgets;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MainChart {

    private List<ThisWeek> thisWeek;
    private List<LastWeek> lastWeek;
    private List<WeeksAgo> twoWeeksAgo;


    public MainChart(){
        getList();

    }

    public List[] getList(){

        WeeksAgo twoWeeksAgo1 = new WeeksAgo();
        ArrayList<WeeksAgo> weeksAgoList = new ArrayList<WeeksAgo>();
        twoWeeksAgo1.setName("Mon");
        weeksAgoList.add(twoWeeksAgo1);


        Series series1 = new Series();
        ArrayList<Series> seriesList = new ArrayList<Series>();
        series1.setName("issues");
        series1.setValue(37);
        seriesList.add(series1);


        Series series2 = new Series();
        series2.setName("closed issues");
        series2.setValue(9);
        seriesList.add(series2);

        twoWeeksAgo1.setSeries(seriesList);



        WeeksAgo twoWeeksAgo2 = new WeeksAgo();
        twoWeeksAgo2.setName("Tue");
        weeksAgoList.add(twoWeeksAgo2);

        Series series3 = new Series();
        ArrayList<Series> seriesList2 = new ArrayList<Series>();
        series3.setName("issues");
        series3.setValue(32);
        seriesList2.add(series3);


        Series series4 = new Series();
        series4.setName("closed issues");
        series4.setValue(12);
        seriesList2.add(series4);

        twoWeeksAgo2.setSeries(seriesList2);





        WeeksAgo twoWeeksAgo3 = new WeeksAgo();
        twoWeeksAgo3.setName("Wed");
        weeksAgoList.add(twoWeeksAgo3);

        Series series5 = new Series();
        ArrayList<Series> seriesList3 = new ArrayList<Series>();
        series5.setName("issues");
        series5.setValue(39);
        seriesList3.add(series5);


        Series series6 = new Series();
        series6.setName("closed issues");
        series6.setValue(9);
        seriesList3.add(series6);

        twoWeeksAgo3.setSeries(seriesList3);

        WeeksAgo twoWeeksAgo4 = new WeeksAgo();
        twoWeeksAgo4.setName("Thu");
        weeksAgoList.add(twoWeeksAgo4);

        Series series7 = new Series();
        ArrayList<Series> seriesList4 = new ArrayList<Series>();
        series7.setName("issues");
        series7.setValue(27);
        seriesList4.add(series7);


        Series series8 = new Series();
        series8.setName("closed issues");
        series8.setValue(12);
        seriesList4.add(series8);

        twoWeeksAgo4.setSeries(seriesList4);

        WeeksAgo twoWeeksAgo5 = new WeeksAgo();
        twoWeeksAgo5.setName("Fri");
        weeksAgoList.add(twoWeeksAgo5);

        Series series9 = new Series();
        ArrayList<Series> seriesList5 = new ArrayList<Series>();
        series9.setName("issues");
        series9.setValue(18);
        seriesList5.add(series9);


        Series series10 = new Series();
        series10.setName("closed issues");
        series10.setValue(7);
        seriesList5.add(series5);

        twoWeeksAgo5.setSeries(seriesList5);

        WeeksAgo twoWeeksAgo6 = new WeeksAgo();
        twoWeeksAgo6.setName("Sat");
        weeksAgoList.add(twoWeeksAgo6);

        Series series11 = new Series();
        ArrayList<Series> seriesList6 = new ArrayList<Series>();
        series11.setName("issues");
        series11.setValue(24);
        seriesList6.add(series11);


        Series series12 = new Series();
        series12.setName("closed issues");
        series12.setValue(8);
        seriesList6.add(series12);

        twoWeeksAgo6.setSeries(seriesList6);


        WeeksAgo twoWeeksAgo7 = new WeeksAgo();
        twoWeeksAgo7.setName("Sun");
        weeksAgoList.add(twoWeeksAgo7);

        Series series13 = new Series();
        ArrayList<Series> seriesList7 = new ArrayList<Series>();
        series13.setName("issues");
        series13.setValue(20);
        seriesList7.add(series13);


        Series series14 = new Series();
        series14.setName("closed issues");
        series14.setValue(16);
        seriesList7.add(series14);

        twoWeeksAgo7.setSeries(seriesList7);

        //This Week List Data


        ThisWeek thisWeek1 = new ThisWeek();
        ArrayList<ThisWeek> thisWeekList = new ArrayList<ThisWeek>();
        thisWeek1.setName("Mon");
        thisWeekList.add(thisWeek1);


        Series series15 = new Series();
        ArrayList<Series> seriesList8 = new ArrayList<Series>();
        series15.setName("issues");
        series15.setValue(42);
        seriesList8.add(series15);


        Series series16 = new Series();
        series16.setName("closed issues");
        series16.setValue(11);
        seriesList8.add(series16);

        thisWeek1.setSeries(seriesList8);

        ThisWeek thisWeek2 = new ThisWeek();
        thisWeek2.setName("Tue");
        thisWeekList.add(thisWeek2);


        Series series17 = new Series();
        ArrayList<Series> seriesList9 = new ArrayList<Series>();
        series17.setName("issues");
        series17.setValue(28);
        seriesList9.add(series17);


        Series series18 = new Series();
        series18.setName("closed issues");
        series18.setValue(10);
        seriesList9.add(series18);

        thisWeek2.setSeries(seriesList9);




        ThisWeek thisWeek3 = new ThisWeek();
        thisWeek3.setName("Wed");
        thisWeekList.add(thisWeek3);


        Series series19 = new Series();
        ArrayList<Series> seriesList10 = new ArrayList<Series>();
        series5.setName("issues");
        series5.setValue(43);
        seriesList10.add(series19);


        Series series20 = new Series();
        series20.setName("closed issues");
        series20.setValue(8);
        seriesList10.add(series20);

        thisWeek3.setSeries(seriesList10);

        ThisWeek thisWeek4 = new ThisWeek();
        thisWeek4.setName("Thu");
        thisWeekList.add(thisWeek4);


        Series series21 = new Series();
        ArrayList<Series> seriesList11 = new ArrayList<Series>();
        series21.setName("issues");
        series21.setValue(34);
        seriesList11.add(series21);


        Series series22 = new Series();
        series22.setName("closed issues");
        series22.setValue(11);
        seriesList11.add(series22);

        thisWeek4.setSeries(seriesList11);


        ThisWeek thisWeek5 = new ThisWeek();
        thisWeek5.setName("Fri");
        thisWeekList.add(thisWeek5);


        Series series23 = new Series();
        ArrayList<Series> seriesList12 = new ArrayList<Series>();
        series23.setName("issues");
        series23.setValue(20);
        seriesList12.add(series23);


        Series series24 = new Series();
        series24.setName("closed issues");
        series24.setValue(8);
        seriesList12.add(series24);

        thisWeek5.setSeries(seriesList12);

        ThisWeek thisWeek6 = new ThisWeek();
        thisWeek6.setName("Sat");
        thisWeekList.add(thisWeek6);


        Series series25 = new Series();
        ArrayList<Series> seriesList13 = new ArrayList<Series>();
        series25.setName("issues");
        series25.setValue(25);
        seriesList13.add(series25);


        Series series26 = new Series();
        series26.setName("closed issues");
        series26.setValue(10);
        seriesList13.add(series26);

        thisWeek6.setSeries(seriesList13);

        ThisWeek thisWeek7 = new ThisWeek();
        thisWeek7.setName("Sun");
        thisWeekList.add(thisWeek7);


        Series series27 = new Series();
        ArrayList<Series> seriesList14 = new ArrayList<Series>();
        series27.setName("issues");
        series27.setValue(22);
        seriesList13.add(series27);


        Series series28 = new Series();
        series28.setName("closed issues");
        series28.setValue(17);
        seriesList14.add(series28);

        thisWeek7.setSeries(seriesList14);

        //Last Week Data

        LastWeek lastWeek1 = new LastWeek();
        ArrayList<LastWeek> lastWeekList = new ArrayList<LastWeek>();
        lastWeek1.setName("Mon");
        lastWeekList.add(lastWeek1);


        Series series29 = new Series();
        ArrayList<Series> seriesList15 = new ArrayList<Series>();
        series29.setName("issues");
        series29.setValue(37);
        seriesList15.add(series29);


        Series series30 = new Series();
        series30.setName("closed issues");
        series30.setValue(12);
        seriesList15.add(series30);

        lastWeek1.setSeries(seriesList15);



        LastWeek lastWeek2 = new LastWeek();
        lastWeek2.setName("Tue");
        lastWeekList.add(lastWeek2);


        Series series31 = new Series();
        ArrayList<Series> seriesList16 = new ArrayList<Series>();
        series31.setName("issues");
        series31.setValue(24);
        seriesList16.add(series31);


        Series series32 = new Series();
        series32.setName("closed issues");
        series32.setValue(8);
        seriesList16.add(series32);

        lastWeek2.setSeries(seriesList16);

        LastWeek lastWeek3 = new LastWeek();
        lastWeek3.setName("Wed");
        lastWeekList.add(lastWeek3);


        Series series33 = new Series();
        ArrayList<Series> seriesList17 = new ArrayList<Series>();
        series33.setName("issues");
        series33.setValue(51);
        seriesList17.add(series33);


        Series series34 = new Series();
        series34.setName("closed issues");
        series34.setValue(7);
        seriesList17.add(series34);

        lastWeek3.setSeries(seriesList17);


        LastWeek lastWeek4 = new LastWeek();
        lastWeek2.setName("Thu");
        lastWeekList.add(lastWeek4);


        Series series35 = new Series();
        ArrayList<Series> seriesList18 = new ArrayList<Series>();
        series35.setName("issues");
        series35.setValue(31);
        seriesList18.add(series33);


        Series series36 = new Series();
        series36.setName("closed issues");
        series36.setValue(13);
        seriesList18.add(series36);

        lastWeek4.setSeries(seriesList18);


        LastWeek lastWeek5 = new LastWeek();
        lastWeek5.setName("Fri");
        lastWeekList.add(lastWeek5);


        Series series37 = new Series();
        ArrayList<Series> seriesList19 = new ArrayList<Series>();
        series37.setName("issues");
        series37.setValue(29);
        seriesList19.add(series37);


        Series series38 = new Series();
        series38.setName("closed issues");
        series38.setValue(7);
        seriesList19.add(series38);

        lastWeek5.setSeries(seriesList19);

        LastWeek lastWeek6 = new LastWeek();
        lastWeek6.setName("Sat");
        lastWeekList.add(lastWeek6);


        Series series39 = new Series();
        ArrayList<Series> seriesList20 = new ArrayList<Series>();
        series39.setName("issues");
        series39.setValue(17);
        seriesList20.add(series39);


        Series series40 = new Series();
        series40.setName("closed issues");
        series40.setValue(6);
        seriesList20.add(series40);

        lastWeek6.setSeries(seriesList20);

        LastWeek lastWeek7 = new LastWeek();
        lastWeek7.setName("Sun");
        lastWeekList.add(lastWeek7);


        Series series41 = new Series();
        ArrayList<Series> seriesList21 = new ArrayList<Series>();
        series41.setName("issues");
        series41.setValue(31);
        seriesList21.add(series41);


        Series series42 = new Series();
        series42.setName("closed issues");
        series42.setValue(10);
        seriesList21.add(series42);

        lastWeek7.setSeries(seriesList21);




        this.setThisWeek(new ArrayList<ThisWeek>(thisWeekList));
        this.setLastWeek(new ArrayList<>(lastWeekList));
        this.setTwoWeeksAgo(new ArrayList<>(weeksAgoList));

        return new List[] {thisWeekList, lastWeekList,weeksAgoList };
    }




}

