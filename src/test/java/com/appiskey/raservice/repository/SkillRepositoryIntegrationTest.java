package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Skill;
import com.appiskey.raservice.util.Datagen;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class SkillRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private SkillRepository skillRepository;

    @Test
    public void whenFindByName_thenReturnItem() {
        Skill item1 = Datagen.generateSkill("item1");
        entityManager.persistAndFlush(item1);
        Skill found = skillRepository.findBySkillName(item1.getSkillName());
        assertThat(found.getSkillName()).isEqualTo(item1.getSkillName());
    }

    @Test
    public void whenInvalidName_thenReturnNull() {
        Skill fromDb = skillRepository.findBySkillName("doesNotExist");
        assertThat(fromDb).isNull();
    }

    @Test
    public void whenFindById_thenReturnItem() {
        Skill item1 = Datagen.generateSkill("item1");
        entityManager.persistAndFlush(item1);
        Skill fromDb = skillRepository.findById(item1.getId()).orElse(null);
        assertThat(fromDb.getSkillName()).isEqualTo(item1.getSkillName());
    }

    @Test
    public void whenInvalidId_thenReturnNull() {
        Datagen.getUuId();
        Skill fromDb = skillRepository.findById(Datagen.getUuId()).orElse(null);
        assertThat(fromDb).isNull();
    }


    @Test
    public void givenSetOfItems_whenFindAll_thenReturnAllItems() {
        Skill item1 = Datagen.generateSkill("item1");
        Skill item2 = Datagen.generateSkill("item2");
        Skill item3 = Datagen.generateSkill("item3");
        entityManager.persist(item1);
        entityManager.persist(item2);
        entityManager.persist(item3);
        entityManager.flush();
        List<Skill> allEmployees = skillRepository.findAllByDeleted(false);
        assertThat(allEmployees).hasSize(3).extracting(Skill::getSkillName).containsOnly(item1.getSkillName(), item2.getSkillName(), item3.getSkillName());
    }

    @After
    public void resetDb() {
        skillRepository.deleteAll();
    }

//
//    @Test
//    public void whenFindAll_thenReturnSkillList() {
//
//        // given
//        Skill devops = new Skill();
//        devops.setSkillName("devops");
//        entityManager.persist(devops);
//
//        Skill html = new Skill();
//        devops.setSkillName("html");
//        entityManager.persist(html);
//
//
//        Skill css = new Skill();
//        devops.setSkillName("css");
//        entityManager.persist(css);
//
//        entityManager.flush();
//
//
//        // when
//        Iterable<Skill> found = skillRepository.findAll();
//
//        // then
//        assertThat(found)
//                .isNotEmpty()
//                .hasSize(3)
//                .contains(css)
//                .doesNotContainNull();
//    }
}
