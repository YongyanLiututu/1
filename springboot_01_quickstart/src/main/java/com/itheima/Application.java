package com.itheima;

import com.itheima.controller.BookController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        contextLoads();
    }
    @Autowired
    private BookController bookController;

    static void contextLoads() {
        System.out.println("ApplicationTests.contextLoads");
    }

    void testSAVER() {
        bookController.getById(2);
    }
}
