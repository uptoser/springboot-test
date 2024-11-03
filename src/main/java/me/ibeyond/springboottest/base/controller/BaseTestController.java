package me.ibeyond.springboottest.base.controller;

import me.ibeyond.springboottest.base.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class BaseTestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:swagger-ui.html";
    }

    @Autowired
    Emp user1;

    @Value("${config.browser.url}")
    String name;

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public Emp main() {
        user1.setName(this.name);
        return user1;
    }
}
