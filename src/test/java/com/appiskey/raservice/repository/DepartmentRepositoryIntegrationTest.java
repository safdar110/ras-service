package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Department;
import com.appiskey.raservice.model.Skill;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
@DataJpaTest
public class DepartmentRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private DepartmentRepository repository;


//    @Test
//    public void whenFindByName_thenReturnSkill() {
//
//        // given
//        Skill devops = new Skill();
//        devops.setSkillName("devops");
//        entityManager.persist(devops);
//        entityManager.flush();
//
//
//        // when
//        Iterable<Skill>  foundList = repository.findByskillNameContainingIgnoreCase("op");
//        Skill found  = Lists.newArrayList(foundList).get(0);
//        // then
//        assertThat(found.getSkillName()).isEqualTo(devops.getSkillName());
//
//    }

    @Test
    public void whenFindAll_thenReturnList() {

        // given
        Department sales = new Department();
        sales.setDepartmentName("sales");
        entityManager.persist(sales);

        Department  accounts = new Department();
        accounts.setDepartmentName("accounts");
        entityManager.persist(accounts);

        entityManager.flush();


        // when
        Iterable<Department> foundList = repository.findAll();

        // then
        assertThat(foundList)
                .isNotEmpty()
                .hasSize(2)
                .contains(sales)
                .doesNotContainNull();

    }

}
