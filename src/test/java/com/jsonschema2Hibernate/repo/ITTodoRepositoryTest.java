package com.jsonschema2Hibernate.repo;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.jsonshema2Hibernate.setting.general.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.test.models.Product;
import org.test.repository.ProductRepository;

import java.util.List;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertThat;

/**
 * @author Petri Kainulainen
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceContext.class})
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class })
//@DatabaseSetup("toDoData.xml")
public class ITTodoRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void search_NoTodoEntriesFound_ShouldReturnEmptyList() {
        List<Product> todoEntries =productRepository.findAll();
        assertThat(todoEntries.size(), is(0));
    }

    @Test
    public void search_OneTodoEntryFound_ShouldReturnAListOfOneEntry() {
//        List<Todo> todoEntries = repository.search("foo");
//
//        assertThat(todoEntries.size(), is(1));
//        assertThat(todoEntries.get(0), allOf(
//                hasProperty("id", is(1L)),
//                hasProperty("title", is("Foo")),
//                hasProperty("description", is("Lorem ipsum"))
//        ));
    }

    @Test
    public void search_TwoTodoEntriesFound_ShouldReturnAListOfTwoEntries() {
//        List<Todo> todoEntries = repository.search("Ips");
//
//        assertThat(todoEntries.size(), is(2));
//        assertThat(todoEntries, contains(
//                allOf(
//                        hasProperty("id", is(1L)),
//                        hasProperty("title", is("Foo")),
//                        hasProperty("description", is("Lorem ipsum"))
//                ),
//                allOf(
//                        hasProperty("id", is(2L)),
//                        hasProperty("title", is("Bar")),
//                        hasProperty("description", is("Lorem ipsum"))
//                )
//        ));
    }
}
