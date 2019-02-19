package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Skill;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;


@RunWith(SpringRunner.class)
@DataJpaTest
public class SkillRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private SkillRepository skillRepository;


    @Test
    public void whenFindByName_thenReturnSkill() {

        // given
        Skill devops = new Skill();
        devops.setSkillName("devops");
        entityManager.persist(devops);
        entityManager.flush();


        // when
        Iterable<Skill>  foundList = skillRepository.findByskillNameContainingIgnoreCase("op");
        Skill found  = Lists.newArrayList(foundList).get(0);
        // then
        assertThat(found.getSkillName()).isEqualTo(devops.getSkillName());

    }

    @Test
    public void whenFindAll_thenReturnSkillList() {

        // given
        Skill devops = new Skill();
        devops.setSkillName("devops");
        entityManager.persist(devops);

        Skill html = new Skill();
        devops.setSkillName("html");
        entityManager.persist(html);


        Skill css = new Skill();
        devops.setSkillName("css");
        entityManager.persist(css);

        entityManager.flush();


        // when
        Iterable<Skill> found = skillRepository.findAll();

        // then
        assertThat(found)
                .isNotEmpty()
                .hasSize(3)
                .contains(css)
                .doesNotContainNull();

    }

}
