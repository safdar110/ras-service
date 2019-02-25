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

    @Test
    public void whenFindByName_thenReturnDepartment() {

        // given
        Department devops = new Department();
        devops.setDepartmentName("devops");
        entityManager.persist(devops);
        entityManager.flush();


        // when
        Iterable<Department>  foundList = repository.findByDepartmentNameContainingIgnoreCase("op");
        Department found  = Lists.newArrayList(foundList).get(0);
        // then
        assertThat(found.getDepartmentName()).isEqualTo(devops.getDepartmentName());

    }

    @Test
    public void whenFindAll_thenReturnDepartmentList() {

        // given
        Department devops = new Department();
        devops.setDepartmentName("devops");
        entityManager.persist(devops);

        Department html = new Department();
        devops.setDepartmentName("html");
        entityManager.persist(html);


        Department css = new Department();
        devops.setDepartmentName("css");
        entityManager.persist(css);

        entityManager.flush();


        // when
        Iterable<Department> found = repository.findAllByDeleted(false);

        // then
        assertThat(found)
                .isNotEmpty()
                .hasSize(3)
                .contains(css)
                .doesNotContainNull();
    }
}
