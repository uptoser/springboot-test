package me.ibeyond.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@SpringBootApplication
public class SpringbootTestApplication {
    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String index() {
//
//        return "index1";
//    }

    public String index() {
        return "redirect:swagger-ui.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTestApplication.class, args);
    }
}
