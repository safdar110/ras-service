package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Feature;
import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.response.widgets.*;
import com.appiskey.raservice.service.ProjectService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "${app.url}" + "/project")
public class ProjectController extends BaseController<ProjectService,Project>{

    ProjectDahboard projectDahboard = new ProjectDahboard();


    @GetMapping("/project-dashboard")
    public ProjectDahboard getProjectDashboard(){

        return new ProjectDahboard();
  }


    @GetMapping("/widget1")
    public DueTask getProjectWidget1(){
        return projectDahboard.getDueTask();
    }



    @GetMapping("/widget2")
    public OverdueTask getProjectWidget2(){
        return projectDahboard.getOverdueTask();
    }

    @GetMapping("/widget3")
    public OpenIssue getProjectWidget3(){
      return projectDahboard.getOpenIssue();
    }

    @GetMapping("/widget4")
    public ProposalFeature getProjectWidget4(){
        return projectDahboard.getFeature();
    }

    @GetMapping("/widget5")
    public ProjectIssue getProjectWidget5(){
        return projectDahboard.getProjectIssue();
    }


//
//    @GetMapping("/widget6")
//    public TaskDistriibution getProjectWidget6(){
//        return projectDahboard.getTaskDistriibution();
//    }

}



