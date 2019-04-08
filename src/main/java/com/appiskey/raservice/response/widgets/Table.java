package com.appiskey.raservice.response.widgets;

import lombok.Data;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@Data
public class Table {
    private List<Row> rows;
    private List<Column> columns;

    public Table(){
        Column column1 = new Column();
        ArrayList<Column> columnList = new ArrayList<Column>();
        column1.setTitle("Budget Type");
        columnList.add(column1);

        Column column2 = new Column();
        column2.setTitle("Total Budget");
        columnList.add(column2);


        Column column3 = new Column();
        column3.setTitle("Spent ($)");
        columnList.add(column3);


        Column column4 = new Column();
        column4.setTitle("Spent (%)");
        columnList.add(column4);

        Column column5 = new Column();
        column5.setTitle("Remaining ($)");
        columnList.add(column5);

        Column column6 = new Column();
        column6.setTitle("Remaining (%)");
        columnList.add(column6);



        Row row1 = new Row();
        List rowList1 = new ArrayList<Row>();
        row1.setValue("Wireframing");
        row1.setClasses("primary");
        rowList1.add(row1);

        Row row2 = new Row();
        row2.setValue("$14,880.00");
        row2.setClasses("text-bold");
        rowList1.add(row2);

        Row row3 = new Row();
        row3.setValue("$14,000.00");
        rowList1.add(row3);

        Row row4 = new Row();
        row4.setValue("%94.08");
        row4.setClasses("text-success");
        row4.setIcon("trending_up");
        rowList1.add(row4);

        Row row5 = new Row();
        row5.setValue("$880.00");
        rowList1.add(row5);

        Row row6 = new Row();
        row6.setValue("%5.92");
        rowList1.add(row6);

        List rowList2 = new ArrayList<Row>();
        Row row7 = new Row();
        row7.setValue("Design");
        row7.setClasses("green");
        row7.setIcon("");
        rowList2.add(row7);

        Row row8 = new Row();
        row8.setValue("$21,080.00");
        row8.setClasses("text-bold");
        row8.setIcon("");
        rowList2.add(row8);


        Row row9 = new Row();
        row9.setValue("$17,240.34");
        row9.setClasses("");
        row9.setIcon("");
        rowList2.add(row9);

        Row row10 = new Row();
        row10.setValue("%81.78");
        row10.setClasses("text-success");
        row10.setIcon("trending_up");
        rowList2.add(row10);

        Row row11 = new Row();
        row11.setValue("$3,839.66");
        row11.setClasses("");
        row11.setIcon("");
        rowList2.add(row11);


        Row row12 = new Row();
        row12.setValue("%18.22");
        row12.setClasses("");
        row12.setIcon("");
        rowList2.add(row12);


        List rowList3 = new ArrayList<Row>();
        Row row13 = new Row();
        row13.setValue("Extra");
        row13.setClasses("orange");
        row13.setIcon("");
        rowList3.add(row13);

        Row row14 = new Row();
        row14.setValue("$18,600.00");
        row14.setClasses("text-bold");
        row14.setIcon("");
        rowList3.add(row14);

        Row row15 = new Row();
        row15.setValue("$0.00");
        row15.setClasses("");
        row15.setIcon("");
        rowList3.add(row15);

        Row row16 = new Row();
        row16.setValue("$0.00");
        row16.setClasses("text-info");
        row16.setIcon("trending_flat");
        rowList3.add(row16);

        Row row17 = new Row();
        row17.setValue("$34,720.00");
        row17.setClasses("");
        row17.setIcon("");
        rowList3.add(row17);

        Row row18 = new Row();
        row18.setValue("%100.00");
        row18.setClasses("");
        row18.setIcon("");
        rowList3.add(row18);

        List list = new ArrayList<Row>();
        list.add(rowList1);
        list.add(rowList2);
        list.add(rowList3);

        this.setRows(new ArrayList<>(list));
        this.setColumns(new ArrayList<>(columnList));




    }

}
