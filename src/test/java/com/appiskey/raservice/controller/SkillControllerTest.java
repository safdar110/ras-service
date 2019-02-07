package com.appiskey.raservice.controller;

import com.appiskey.raservice.service.SkillService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Created by khawar on 2/7/19.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SkillControllerTest {
    MockMvc mockMvc;

    @Mock
    SkillController skillController;

    @Autowired
    SkillService skillService;

    @Before
    public void setup() throws Exception{
        mockMvc = MockMvcBuilders.standaloneSetup(skillController).build();
    }

     @Test
    public void testSkillAdd() throws Exception{

     }
}
