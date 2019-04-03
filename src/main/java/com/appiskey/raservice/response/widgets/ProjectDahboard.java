package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class ProjectDahboard {
    private DueTask dueTask;
    private OverdueTask overdueTask;
    private OpenIssue openIssue;
    private ProposalFeature feature;
    private ProjectIssue projectIssue;
    private TaskDistriibution taskDistriibution;
    private Schedule schedule;
    private BudgetDistribution budgetDistribution;
    private BudgetSpent budgetSpent;
    private BudgetDetail budgetDetail;
    private TeamMember teamMember;


    public ProjectDahboard(){
      this.setDueTask(new DueTask());
      this.setOverdueTask(new OverdueTask());
      this.setOpenIssue(new OpenIssue());
      this.setFeature(new ProposalFeature());
      this.setProjectIssue(new ProjectIssue());
      this.setTaskDistriibution(new TaskDistriibution());
      this.setSchedule(new Schedule());
      this.setBudgetDistribution(new BudgetDistribution());
      this.setBudgetSpent(new BudgetSpent());
      this.setBudgetDetail(new BudgetDetail());
      this.setTeamMember(new TeamMember());


    }


}
