package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.service.BaseService;
import com.appiskey.raservice.service.SkillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.CoreMatchers.is;
@RunWith(SpringRunner.class)
@WebMvcTest(SkillController.class)
public class SkillControllerIntegrationTest {

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private SkillService service;

    @Test
    public void givenSkills_whenGetSkills_thenReturnJsonArray() throws Exception{
        Skill python = new Skill();
        python.setSkillName("python");
        List<Skill> allSkills = Arrays.asList(python);
        given(service.findAll()).willReturn(allSkills);
        mockMvc.perform(get(appUrl + "/skill")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].skillName", is(python.getSkillName())));
    }
}
