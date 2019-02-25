package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.service.DepartmentService;
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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(DepartmentController.class)
public class DepartmentControllerIntegrationTest {

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private DepartmentService service;

    @Test
    public void givenDepartments_whenGetDepartments_thenReturnJsonArray() throws Exception{
        Department python = new Department();
        python.setDepartmentName("python");
        List<Department> allDepartments = Arrays.asList(python);
        given(service.getAll()).willReturn(allDepartments);
        mockMvc.perform(get(appUrl + "/department")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].departmentName", is(python.getDepartmentName())));
    }
}
