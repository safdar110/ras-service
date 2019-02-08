package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.service.SkillService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.nio.file.Files;

/**
 * Created by khawar on 2/7/19.
 */

//Add
//getAll
//getById
//Update
//Delete



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SkillControllerTest {
    MockMvc mockMvc;

    @Mock
    SkillController skillController;

    @Autowired
    private TestRestTemplate template;

    @Autowired
    SkillService skillService;

    @Before
    public void setup() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(skillController).build();
    }

    @Test
    public void testSkillAdd() throws Exception {
        File file = ResourceUtils.getFile("classpath:jsonfortest/skill.json");
        String content = new String(Files.readAllBytes(file.toPath()));

        HttpEntity<Object> skill = getHttpEntity(content);
        ResponseEntity<Skill> response = template.postForEntity("/api/ras/v1/skill/add", skill, Skill.class);
        Assert.assertEquals("Test Skill", response.getBody().getSkillName());
        Assert.assertEquals(200, response.getStatusCode().value());

        //cleanup db record
//        skillService.deleteSkill(response.getBody().getId());
    }

    @Test
    public void testSkillUpdate() throws Exception {
        File file = ResourceUtils.getFile("classpath:jsonfortest/skill.json");
        String content = new String(Files.readAllBytes(file.toPath()));

        HttpEntity<Object> skill = getHttpEntity(content);
        ResponseEntity<Skill> response = template.postForEntity("/api/ras/v1/skill/update", skill, Skill.class);
        Assert.assertEquals("Test Skill", response.getBody().getSkillName());
        Assert.assertEquals(200, response.getStatusCode().value());

        //cleanup db record
        skillService.deleteSkill(response.getBody().getId());
    }

    private HttpEntity<Object> getHttpEntity(Object body) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new HttpEntity<Object>(body, headers);
    }
}
