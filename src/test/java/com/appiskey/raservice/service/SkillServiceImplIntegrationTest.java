package com.appiskey.raservice.service;

import com.appiskey.raservice.repository.SkillRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

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
}
