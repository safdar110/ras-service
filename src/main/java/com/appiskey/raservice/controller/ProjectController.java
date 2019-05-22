package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Filter;
import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.projection.*;
import com.appiskey.raservice.projection.BudgetDetail;
import com.appiskey.raservice.projection.TotalRemaining;
import com.appiskey.raservice.response.widgets.*;
import com.appiskey.raservice.service.ProjectService;
import com.appiskey.raservice.service.ResourceProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
@RequestMapping(value = "${app.url}" + "/project")
public class ProjectController extends BaseController<ProjectService,Project>{





    @Autowired
    ResourceProjectService resourceProjectService;



    @GetMapping("/count")
    public ProjectCount totalProjects(){
        return service.findCountDistinct();
    }

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

  @GetMapping("/critical-project")
  public List<ProjectObject> CriticalProjects(){
        return service.getAllNames();
  }

  @GetMapping("/total-revenue")
    public ProjectTotalRevenue findTotalRevenue(){
        return service.findTotalRevenue();

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

    @GetMapping("/total-budget")
    public BudgetCount findTotalBudget(){
        return  service.findTotalBudget();
    }

    @GetMapping("/detail")
    public List<ProjectDetail> findProjectDetail(){
        return service.findProjectDetail();
    }

//    @GetMapping("/percent-complete")
//    public ProjectComplete findProjectPercentCompleted(){
//        return service.findProjectPercentCompleted();
//    }
//
//    @GetMapping("/widget6")
//    public TaskDistriibution getProjectWidget6(){
//        return projectDahboard.getTaskDistriibution();
//    }

    @PostMapping("/filter")
    public FilterTotalRevenue findFilteredTotalRevenue(@RequestBody Filter filter){
        return service.findFilteredTotalRevenue(filter.getTo(), filter.getFrom());
    }

    @GetMapping("/budget-detail")
    public List<BudgetDetail> findBudgetDetail(){
        return service.findBudgetDetail();
    }

    @GetMapping("/project-percent-complete")
    public ProjectComplete findProjectPercentCompleted(){
        return service.findProjectPercentCompleted();
    }

    @GetMapping("/total-remaining")
    public TotalRemaining findTotalRemaining(){
        return service.findTotalRemaining();
    }


    @GetMapping("/project-health")
    public List<ProjectHealth> findProjectHealth(){
        return service.findProjectHealth();
    }
//
    @PostMapping("/total-revenue-per-project")
    public TotalRevenuePerProject findTotalRevenuePerProject(@RequestBody FilterByProjectName filterByProjectName){
        return service.findTotalRevenuePerProjectByName(filterByProjectName.getProjectName());
    }


}



