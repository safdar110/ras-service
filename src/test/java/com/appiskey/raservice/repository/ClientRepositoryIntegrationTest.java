package com.appiskey.raservice.repository;

import com.appiskey.raservice.model.Client;
import com.appiskey.raservice.model.Department;
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
public class ClientRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ClientRepository repository;

//    @Test
//    public void whenFindByName_thenReturnDepartment() {
//
//        // given
//        Department devops = new Department();
//        devops.setDepartmentName("devops");
//        entityManager.persist(devops);
//        entityManager.flush();
//
//
//        // when
//        Iterable<Department>  foundList = repository.findByDepartmentNameContainingIgnoreCase("op");
//        Department found  = Lists.newArrayList(foundList).get(0);
//        // then
//        assertThat(found.getDepartmentName()).isEqualTo(devops.getDepartmentName());
//
//    }

    @Test
    public void whenFindAll_thenReturnList() {

        // given
        Client item1 = new Client();
        item1.setClientName("item1");
        entityManager.persist(item1);

        Client item2 = new Client();
        item2.setClientName("item2");
        entityManager.persist(item2);

        Client item3 = new Client();
        item3.setClientName("item3");
        entityManager.persist(item3);

        entityManager.flush();

        // when
        Iterable<Client> found = repository.findAllByDeleted(false);

        // then
        assertThat(found)
                .isNotEmpty()
                .hasSize(3)
                .contains(item1)
                .contains(item2)
                .contains(item3)
                .doesNotContainNull();
    }
}
