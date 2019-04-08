package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class BudgetSpent {
    private String title;
    private Range ranges;
    private WeeklySpent weeklySpent;
    private  TotalSpent totalSpent;
    private Remaining remaining;
    private TotalRemaining totalRemaining;
    private TotalBudget totalBudget;

public BudgetSpent(){
    this.setTitle("Spent");
    this.setRanges(new Range("This Week","Last week","Two Weeks Ago"));
    this.setWeeklySpent(new WeeklySpent());
    this.setTotalSpent(new TotalSpent());
    this.setRemaining(new Remaining());
    this.setTotalRemaining(new TotalRemaining());
    this.setTotalBudget(new TotalBudget());




}

}
