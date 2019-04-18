package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class BudgetDetail {
    private String title;
    private Table table;

    public BudgetDetail(){
        this.setTitle("Budget Details");
        this.setTable(new Table());
    }

}
