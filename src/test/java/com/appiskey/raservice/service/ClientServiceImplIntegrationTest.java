package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.repository.ClientRepository;
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
public class ClientServiceImplIntegrationTest {


    @TestConfiguration
    static class ClientServiceImplTestContextConfiguration {
        @Bean
        public ClientService serviceImpl() {
            return new ClientServiceImpl();
        }
    }

    @Autowired
    private ClientService service;

    @MockBean
    private ClientRepository repository;

    // write test cases here

    @Before
    public void setup() {
        Client tom = new Client();
        tom.setName("tom");
        ArrayList<Client> newList = new ArrayList<>();
        newList.add(tom);

        Iterable<Client> foundList = repository.findAllByDeleted(false);
        Mockito.when(foundList)
                .thenReturn(newList);
    }

    @Test
    public void whenFindAll_thenListShouldBefound() {
        Client tom = new Client();
        tom.setName("tom");
        Iterable<Client> foundList = service.getAll();
        assertThat(foundList)
                .isNotEmpty()
                .containsOnly(tom)
                .hasSize(1);
    }

}
