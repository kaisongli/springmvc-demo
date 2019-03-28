package com.lks.service;

import com.lks.entities.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by likaisong on 2019/3/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestService {

    @Resource
    private BookService bookService;

    @Test
    public void testGetAllBooks() {
        List<Book> books =bookService.getAllBooks();
        System.out.println(books);
    }
}
