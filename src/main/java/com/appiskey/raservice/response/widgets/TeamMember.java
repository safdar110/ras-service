package com.appiskey.raservice.response.widgets;

import lombok.Data;

@Data
public class TeamMember {
    private String title;
    private TeamMemberTable table;

    public TeamMember(){
        this.setTitle("Team Members");
        this.setTable(new TeamMemberTable());
    }

}
