package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.DepartmentRepository;
import com.appiskey.raservice.repository.SkillRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class DepartmentServiceImplIntegrationTest {


    @TestConfiguration
    static class DepartmentServiceImplTestContextConfiguration {
        @Bean
        public DepartmentService serviceImpl() {
            return new DepartmentServiceImpl();
        }
    }

    @Autowired
    private DepartmentService service;

    @MockBean
    private DepartmentRepository repository;

    // write test cases here

    @Before
    public void setup(){
        Department sales = new Department();
        sales.setDepartmentName("sales");
        ArrayList<Department> newList = new ArrayList<>();
        newList.add(sales);

        Iterable<Department>  foundList = repository.findByDepartmentNameContainingIgnoreCase("sales");
        Mockito.when(foundList)
                .thenReturn(newList);
    }

    @Test
    public void whenValidName_thenSkillShouldBefound(){
        String name = "sales";
        Iterable<Department>  foundList  = service.searchDepartment(name);
        Department found  = Lists.newArrayList(foundList).get(0);
        assertThat(found.getDepartmentName())
                .isEqualTo(name);
    }

}
