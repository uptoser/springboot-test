package me.ibeyond.springboottest.test2.web;

import me.ibeyond.springboottest.config.UserSettings;
import me.ibeyond.springboottest.test2.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class Test2Controller {

    @Autowired
    UserSettings user1;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public UserSettings main() {
        Test test = new Test();
        test.setId("11");
        test.setName("aaa");
        return user1;
    }
}
