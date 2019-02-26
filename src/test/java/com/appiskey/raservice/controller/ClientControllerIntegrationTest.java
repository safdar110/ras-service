package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.service.ClientService;
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
@WebMvcTest(ClientController.class)
public class ClientControllerIntegrationTest {

    @Value("${app.url}")
    private String appUrl;

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private ClientService service;

    @Test
    public void givenItems_whenGetItems_thenReturnJsonArray() throws Exception{
        Client item1 = new Client();
        item1.setName("item1");
        List<Client> allItems = Arrays.asList(item1);
        given(service.getAll()).willReturn(allItems);
        mockMvc.perform(get(appUrl + "/client")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(1)))
                .andExpect(jsonPath("$[0].name", is(item1.getName())));
    }
}
