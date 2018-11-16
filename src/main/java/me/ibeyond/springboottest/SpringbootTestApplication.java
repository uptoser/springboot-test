package me.ibeyond.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
    }
}
