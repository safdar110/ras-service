package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.SkillRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class SkillServiceImplIntegrationTest {


    @TestConfiguration
    static class SkillServiceImplTestContextConfiguration {
        @Bean
        public SkillService skillService() {
            return new SkillServiceImpl();
        }
    }

    @Autowired
    private SkillService skillService;

    @MockBean
    private SkillRepository skillRepository;

    // write test cases here

    @Before
    public void setup(){
        Skill python = new Skill();
        python.setSkillName("python");
        Mockito.when(skillRepository.findByskillName(python.getSkillName())).thenReturn(python);

    }

    @Test
    public void whenValidName_thenSkillShouldBefound(){
        String name = "python";
        Skill found = skillService.findByskillName(name);

        assertThat(found.getSkillName())
                .isEqualTo(name);
    }

}
