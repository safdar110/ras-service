package com.appiskey.raservice.response.widgets;


import lombok.Data;

import java.util.ArrayList;


@Data
public class _MainChart {



  public _MainChart(){
      ArrayList<ThisWeek> thisWeekList = new ArrayList<ThisWeek>();
      ArrayList<LastWeek> lastWeekList = new ArrayList<LastWeek>();
      ArrayList<WeeksAgo> weeksAgoList = new ArrayList<WeeksAgo>();


      ThisWeek thisWeek1 = new ThisWeek();
      thisWeek1.setName("Frontend");
      thisWeek1.setValue(15);
      thisWeekList.add(thisWeek1);

      ThisWeek thisWeek2 = new ThisWeek();
      thisWeek2.setName("Backend");
      thisWeek2.setValue(20);
      thisWeekList.add(thisWeek2);

      ThisWeek thisWeek3 = new ThisWeek();
      thisWeek3.setName("API");
      thisWeek3.setValue(38);
      thisWeekList.add(thisWeek3);

      ThisWeek thisWeek4 = new ThisWeek();
      thisWeek4.setName("Issue");
      thisWeek4.setValue(27);
      thisWeekList.add(thisWeek4);

      LastWeek lastWeek1 = new LastWeek();
      lastWeek1.setName("Frontend");
      lastWeek1.setValue(19);
      lastWeekList.add(lastWeek1);

      LastWeek lastWeek2 = new LastWeek();
      lastWeek2.setName("Backend");
      lastWeek2.setValue(16);
      lastWeekList.add(lastWeek2);

      LastWeek lastWeek3 = new LastWeek();
      lastWeek3.setName("API");
      lastWeek3.setValue(42);
      lastWeekList.add(lastWeek3);

      LastWeek lastWeek4 = new LastWeek();
      lastWeek4.setName("Issue");
      lastWeek4.setValue(23);
      lastWeekList.add(lastWeek4);


      WeeksAgo weeksAgo1 = new WeeksAgo();
      weeksAgo1.setName("Frontend");
      weeksAgo1.setValue(15);
      weeksAgoList.add(weeksAgo1);

      WeeksAgo weeksAgo2 = new WeeksAgo();
      weeksAgo2.setName("Backend");
      weeksAgo2.setValue(20);
      weeksAgoList.add(weeksAgo2);

      WeeksAgo weeksAgo3= new WeeksAgo();
      weeksAgo3.setName("API");
      weeksAgo3.setValue(38);
      weeksAgoList.add(weeksAgo3);

      WeeksAgo weeksAgo4 = new WeeksAgo();
      weeksAgo4.setName("Issue");
      weeksAgo4.setValue(27);
      weeksAgoList.add(weeksAgo4);






  }


}