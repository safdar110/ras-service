package com.appiskey.raservice.service;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.repository.SkillRepository;
import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
    private SkillRepository repository;

    // write test cases here

    @Before
    public void setup() {
        UUID wrongId = UUID.randomUUID();
        UUID uuid = UUID.fromString("123e4567-e89b-42d3-a456-556642440000");
        Skill item1 = generateItem("item1");
        item1.setId(uuid);

        Skill item2 = generateItem("item2");

        Skill item3 = generateItem("item3");

        List<Skill> allItems = Arrays.asList(item1, item2, item3);

        Mockito.when(repository.findBySkillName(item1.getSkillName())).thenReturn(item1);
        Mockito.when(repository.findBySkillName(item2.getSkillName())).thenReturn(item2);
        Mockito.when(repository.findBySkillName("wrong name")).thenReturn(null);
        Mockito.when(repository.findById(uuid)).thenReturn(Optional.of(item1));
        Mockito.when(repository.findAll()).thenReturn(allItems);
        Mockito.when(repository.findById(wrongId)).thenReturn(Optional.empty());
    }

    @Test
    public void whenValidName_thenItemShouldBeFound() {
        String name = "item1";
        Skill found = service.getSkillBySkillName(name);
        assertThat(found.getSkillName()).isEqualTo(name);
    }


    @Test
    public void whenInValidName_thenItemShouldNotBeFound() {
        Skill fromDb = service.getSkillBySkillName("wrong_name");
        assertThat(fromDb).isNull();
        verifyFindByNameIsCalledOnce("wrong_name");
    }

    @Test
    public void whenValidName_thenItemShouldExist() {
        boolean doesEmployeeExist = service.exists("item1");
        assertThat(doesEmployeeExist).isEqualTo(true);
        verifyFindByNameIsCalledOnce("item1");
    }

    @Test
    public void whenNonExistingName_thenItemShouldNotExist() {
        boolean doesEmployeeExist = service.exists("some_name");
        assertThat(doesEmployeeExist).isEqualTo(false);
        verifyFindByNameIsCalledOnce("some_name");
    }

    @Test
    public void whenValidId_thenItemShouldBeFound() {
        UUID uuid = UUID.fromString("123e4567-e89b-42d3-a456-556642440000");
        Skill fromDb = service.findById(uuid);
        assertThat(fromDb.getSkillName()).isEqualTo("item1");
        verifyFindByIdIsCalledOnce(uuid);
    }

//    @Test
//    public void whenInValidId_thenItemShouldNotBeFound() {
//        UUID wrongUuid = UUID.fromString("123e4567-e89b-42d3-a456-556642449911");
//        Skill fromDb = service.findById(wrongUuid);
//        verifyFindByIdIsCalledOnce(wrongUuid);
//        assertThat(fromDb).isNull();
//    }

    @Test
    public void given3Items_whengetAll_thenReturn3Records() {
        Skill item1 = generateItem("item1");
        Skill item2 = generateItem("item2");
        Skill item3 = generateItem("item3");

//        Employee john = new Employee("john");
//        Employee bob = new Employee("bob");

        List<Skill> allItems = service.findAll();
        verifyFindAllEmployeesIsCalledOnce();
        assertThat(allItems).hasSize(3).extracting(Skill::getSkillName).contains(item1.getSkillName(), item2.getSkillName(), item3.getSkillName());
    }

//    ================================================================================

    private Skill generateItem(String name) {
        Skill item = new Skill();
        item.setSkillName(name);
        UUID uuid = UUID.randomUUID();
        item.setId(uuid);
        return item;
    }

    private void verifyFindByNameIsCalledOnce(String name) {
        Mockito.verify(repository, VerificationModeFactory.times(1)).findBySkillName(name);
        Mockito.reset(repository);
    }

    private void verifyFindByIdIsCalledOnce(UUID uuid) {
        Mockito.verify(repository, VerificationModeFactory.times(1)).findById(uuid);
        Mockito.reset(repository);
    }

    private void verifyFindAllEmployeesIsCalledOnce() {
        Mockito.verify(repository, VerificationModeFactory.times(1)).findAll();
        Mockito.reset(repository);
    }

}
