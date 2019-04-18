package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.repository.ResourceProjectRepository;
import com.appiskey.raservice.response.widgets.*;
import com.appiskey.raservice.service.ProjectService;
import com.appiskey.raservice.service.ResourceProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "${app.url}" + "/project")
public class ProjectController extends BaseController<ProjectService,Project>{





    @Autowired
    ResourceProjectService resourceProjectService;

    @Autowired
    ResourceProjectRepository resourceProjectRepository;


    @PutMapping("/project")
    @ResponseStatus(value = HttpStatus.CREATED)
    public Project insertProject(@RequestBody Project item) {
      // item.getResourceProjects();

//        if(resourceProjectService.existsByProjectId(item.getId())) {
//            resourceProjectService.delete(item.getId());
//        }
       if(resourceProjectService.existsByProjectId(item.getId()))
       resourceProjectService.deleteByProjectId(item.getId());
        //System.out.println("/");


        resourceProjectService.saveAll(item.getResourceProjects());
                return service.update(item);

        }



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



