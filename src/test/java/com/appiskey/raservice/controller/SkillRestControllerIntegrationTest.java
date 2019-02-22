package com.appiskey.raservice.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.appiskey.raservice.RaserviceApplication;
import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.SkillRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = RaserviceApplication.class)
@AutoConfigureMockMvc
// @TestPropertySource(locations = "classpath:application-integrationtest.properties")
@AutoConfigureTestDatabase
public class SkillRestControllerIntegrationTest {

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    private MockMvc mvc;

    @Autowired
    private SkillRepository repository;

    @After
    public void resetDb() {
        repository.deleteAll();
    }

    @Test
    public void whenValidInput_thenCreateItem() throws IOException, Exception{
        Skill item1 = new Skill();
        item1.setSkillName("foo");

        mvc.perform(post(appUrl + "/skill").contentType(MediaType.APPLICATION_JSON).content(JsonUtil.toJson(item1)));
        Iterable<Skill> found = repository.findAll();
        assertThat(found).extracting(Skill::getSkillName).containsOnly("foo");
    }
    @Test
    public void givenEmployees_whenGetEmployees_thenStatus200() throws Exception {
        createTestItem("foo");
        createTestItem("bar");

        // @formatter:off
        mvc.perform(get(appUrl + "/skill").contentType(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(greaterThanOrEqualTo(2))))
                .andExpect(jsonPath("$[0].skillName", is("foo")))
                .andExpect(jsonPath("$[1].skillName", is("bar")));
        // @formatter:on
    }

    private void createTestItem(String name) {
        Skill item = new Skill();
        item.setSkillName(name);
        repository.saveAndFlush(item);
    }
}
