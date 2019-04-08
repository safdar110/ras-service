package com.appiskey.raservice.response.widgets;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TeamMemberTable {

    private List<Row> rows;
    private List<Column> columns;


    public TeamMemberTable(){
        Column column1 = new Column();
        ArrayList<Column> columnList = new ArrayList<Column>();
        column1.setTitle("avatar");
        columnList.add(column1);

        Column column2 = new Column();
        column2.setTitle("name");
        columnList.add(column2);


        Column column3 = new Column();
        column3.setTitle("position");
        columnList.add(column3);


        Column column4 = new Column();
        column4.setTitle("office");
        columnList.add(column4);

        Column column5 = new Column();
        column5.setTitle("email");
        columnList.add(column5);

        Column column6 = new Column();
        column6.setTitle("phone");
        columnList.add(column6);


        List rowList1 = new ArrayList<Row>();
        Row row1 = new Row();
        row1.setAvatar("assets/images/avatars/james.jpg");
        row1.setName("Jack Gilbert");
        row1.setPosition("Design Manager");
        row1.setOffice("Johor Bahru");
        row1.setEmail("jgilbert48@mail.com");
        row1.setPhone("+16 298 032 7774");
        rowList1.add(row1);


        Row row2 = new Row();
        row2.setAvatar("assets/images/avatars/katherine.jpg");
        row2.setName("Kathy Anderson");
        row2.setPosition("Recruiting Manager");
        row2.setOffice("Solţānābād");
        row2.setEmail("kanderson49@mail.com.br");
        row2.setPhone("+23 572 311 1136");
        rowList1.add(row2);



        Row row3 = new Row();
        row3.setAvatar("Wireframing");
        row3.setName("primary");
        row3.setPosition("primary");
        row3.setOffice("primary");
        row3.setEmail("primary");
        row3.setPhone("primary");
        rowList1.add(row3);



        Row row4 = new Row();
        row4.setAvatar("assets/images/avatars/andrew.jpg");
        row4.setName("Mark Turner");
        row4.setPosition("Recruiting Manager");
        row4.setOffice("Neftegorsk");
        row4.setEmail("mturner4a@mail.com");
        row4.setPhone("+01 139 803 9263");
        rowList1.add(row4);




        Row row5 = new Row();
        row5.setAvatar("assets/images/avatars/jane.jpg");
        row5.setName("Kathryn Martinez");
        row5.setPosition("Director of Sales");
        row5.setOffice("Palekastro");
        row5.setEmail("kmartinez4b@mail.com");
        row5.setPhone("+25 467 022 5393");
        rowList1.add(row5);




        Row row6 = new Row();
        row6.setAvatar("assets/images/avatars/alice.jpg");
        row6.setName("Annie Gonzales");
        row6.setPosition("Actuary");
        row6.setOffice("Candon");
        row6.setEmail("agonzales4c@mail.edu");
        row6.setPhone("+99 891 619 7138");
        rowList1.add(row6);




        Row row7 = new Row();
        row7.setAvatar("assets/images/avatars/vincent.jpg");
        row7.setName("Howard King");
        row7.setPosition("Human Resources");
        row7.setOffice("Bergen op Zoom");
        row7.setEmail("hking4d@mail.gov");
        row7.setPhone("+46 984 348 1409");
        rowList1.add(row7);




        Row row8 = new Row();
        row8.setAvatar("assets/images/avatars/joyce.jpg");
        row8.setName("Elizabeth Dixon");
        row8.setPosition("Electrical Engineer");
        row8.setOffice("Písečná");
        row8.setEmail("edixon4e@mail.gov");
        row8.setPhone("+33 332 067 9063");
        rowList1.add(row8);


        Row row9 = new Row();
        row9.setAvatar("assets/images/avatars/danielle.jpg");
        row9.setName("Dorothy Morris");
        row9.setPosition("Office Assistant");
        row9.setOffice("Magsaysay");
        row9.setEmail("dmorris4f@mail.com");
        row9.setPhone("+05 490 958 6120");
        rowList1.add(row9);



        Row row10 = new Row();
        row10.setAvatar("assets/images/avatars/carl.jpg");
        row10.setName("Mark Gonzales");
        row10.setPosition("Quality Control");
        row10.setOffice("Matsue-shi");
        row10.setEmail("mgonzales4g@mail.com");
        row10.setPhone("+03 168 394 9935");
        rowList1.add(row10);



        Row row11 = new Row();
        row11.setAvatar("assets/images/avatars/profile.jpg");
        row11.setName("Catherine Rogers");
        row11.setPosition("Programmer Analyst");
        row11.setOffice("Kangar");
        row11.setEmail("crogers4h@mail.com");
        row11.setPhone("+86 235 407 5373");
        rowList1.add(row11);



        Row row12 = new Row();
        row12.setAvatar("assets/images/avatars/garry.jpg");
        row12.setName("Ruth Grant");
        row12.setPosition("Community Outreach");
        row12.setOffice("Beaune");
        row12.setEmail("rgrant4i@mail.pl");
        row12.setPhone("+36 288 083 8460");
        rowList1.add(row12);



        Row row13 = new Row();
        row13.setAvatar("assets/images/avatars/james.jpg");
        row13.setName("Phyllis Gutierrez");
        row13.setPosition("Administrative Assistant");
        row13.setOffice("Shlissel’burg");
        row13.setEmail("pgutierrez4j@mail.net");
        row13.setPhone("+52 749 861 9304");
        rowList1.add(row13);



        Row row14 = new Row();
        row14.setAvatar("assets/images/avatars/alice.jpg");
        row14.setName("Lillian Morris");
        row14.setPosition("Media Planner");
        row14.setOffice("Berlin");
        row14.setEmail("lmorris4k@mail.de");
        row14.setPhone("+59 695 110 3856");
        rowList1.add(row14);


        Row row15 = new Row();
        row15.setAvatar("Wireframing");
        row15.setName("primary");
        row15.setPosition("primary");
        row15.setOffice("primary");
        row15.setEmail("primary");
        row15.setPhone("primary");
        rowList1.add(row15);

        Row row16 = new Row();
        row16.setAvatar("assets/images/avatars/vincent.jpg");
        row16.setName("Jeremy Anderson");
        row16.setPosition("Systems Engineer");
        row16.setOffice("Lũng Hồ");
        row16.setEmail("janderson4l@mail.uk");
        row16.setPhone("+40 384 115 1448");
        rowList1.add(row16);

        Row row17 = new Row();
        row17.setAvatar("assets/images/avatars/carl.jpg");
        row17.setName("Arthur Lawrence");
        row17.setPosition("Nurse Practicioner");
        row17.setOffice("Sarkanjut");
        row17.setEmail("alawrence4m@mail.com");
        row17.setPhone("+36 631 599 7867");
        rowList1.add(row17);

        Row row18 = new Row();
        row18.setAvatar("assets/images/avatars/andrew.jpg");
        row18.setName("David Simmons");
        row18.setPosition("Social Worker");
        row18.setOffice("Ushumun");
        row18.setEmail("dsimmons4n@mail.com");
        row18.setPhone("+01 189 681 4417");
        rowList1.add(row18);

        Row row19 = new Row();
        row19.setAvatar("assets/images/avatars/danielle.jpg");
        row19.setName("Daniel Johnston");
        row19.setPosition("Help Desk");
        row19.setOffice("São Carlos");
        row19.setEmail("djohnston4o@mail.gov");
        row19.setPhone("+60 028 943 7919");
        rowList1.add(row19);


        Row row20 = new Row();
        row20.setAvatar("assets/images/avatars/joyce.jpg");
        row20.setName("Ann King");
        row20.setPosition("Internal Auditor");
        row20.setOffice("Liren");
        row20.setEmail("aking4p@mail.com");
        row20.setPhone("+91 103 932 6545");
        rowList1.add(row20);


        Row row21 = new Row();
        row21.setAvatar("assets/images/avatars/james.jpg");
        row21.setName("Phillip Franklin");
        row21.setPosition("VP Accounting");
        row21.setOffice("Soba");
        row21.setEmail("pfranklin4q@mail.com");
        row21.setPhone("+25 820 986 7626");
        rowList1.add(row21);



        Row row22 = new Row();
        row22.setAvatar("assets/images/avatars/garry.jpg");
        row22.setName("Gary Gonzalez");
        row22.setPosition("Speech Pathologist");
        row22.setOffice("Gangkou");
        row22.setEmail("ggonzalez4r@mail.cc");
        row22.setPhone("+10 862 046 7916");
        rowList1.add(row22);





        this.setColumns(new ArrayList<>(columnList));
        this.setRows(new ArrayList<Row>(rowList1));
    }

}
