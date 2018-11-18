package me.ibeyond.springboottest.test2.web;

import me.ibeyond.springboottest.test2.model.Test;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Test2Controller {

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public Test main() {
        Test test = new Test();
        test.setId("11");
        test.setName("aaa");
        return test;
    }
}
