package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
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
public class SkillServiceImplIntegrationTest {


    @TestConfiguration
    static class SkillServiceImplTestContextConfiguration {
        @Bean
        public SkillService serviceImpl() {
            return new SkillServiceImpl();
        }
    }

    @Autowired
    private SkillService service;

    @MockBean
    private SkillRepository skillRepository;

    // write test cases here

    @Before
    public void setup(){
        Skill python = new Skill();
        python.setSkillName("python");
        ArrayList<Skill> newList = new ArrayList<>();
        newList.add(python);

        Iterable<Skill>  foundList = skillRepository.findByskillNameContainingIgnoreCase("python");
        Mockito.when(foundList)
                .thenReturn(newList);
    }

    @Test
    public void whenValidName_thenSkillShouldBefound(){
        String name = "python";
        Iterable<Skill>  foundList  = service.searchBySkillName(name);
        Skill found  = Lists.newArrayList(foundList).get(0);
        assertThat(found.getSkillName())
                .isEqualTo(name);
    }

}
