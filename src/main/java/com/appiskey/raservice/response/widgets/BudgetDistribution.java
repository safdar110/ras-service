package com.appiskey.raservice.response.widgets;

import lombok.Data;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.List;


@Data
public class BudgetDistribution {
    private String title;

    private List<MainChart> mainChart;

    public BudgetDistribution(){

//        MainChart mmainChart1 = new MainChart();
//        ArrayList<MainChart> mainChartList = new ArrayList<>();
//        mmainChart1.setName("Wireframing");
//        mmainChart1.setValue(12);
//        mainChartList.add(mmainChart1);
//
//
//        MainChart mmainChart2 = new MainChart();
//        mmainChart2.setName("Design");
//        mmainChart2.setValue(17);
//        mainChartList.add(mmainChart2);
//
//
//
//        MainChart mmainChart3 = new MainChart();
//        mmainChart3.setName("Coding");
//        mmainChart3.setValue(28);
//        mainChartList.add(mmainChart3);
//
//        MainChart mmainChart4 = new MainChart();
//        mmainChart4.setName("Marketing");
//        mmainChart4.setValue(25);
//        mainChartList.add(mmainChart4);
//
//
//        MainChart mmainChart5 = new MainChart();
//        mmainChart5.setName("Extra");
//        mmainChart5.setValue(15);
//        mainChartList.add(mmainChart5);




        this.setTitle("Budget Distribution");
        this.setMainChart(new ArrayList<>());

    }

}
