package com.itheima;

import com.itheima.controller.BookController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private BookController bookController;
    @Test
    void contextLoads() {
        System.out.println("ApplicationTests.contextLoads");
    }
    @Test
    void testSAVER() {
        bookController.getById(2);
    }

}
