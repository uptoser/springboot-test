package me.ibeyond.springboottest.test.web;

import me.ibeyond.springboottest.config.UserSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/api")
public class TestController {

    private final UserSettings userSettings;

    @Autowired
    public TestController(UserSettings userSettings){
        this.userSettings = userSettings;
    }

    @RequestMapping(value = "/main1", method = RequestMethod.GET)
    public String main(Model model) {
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(234);
        list.add(345);
        model.addAttribute("singlePerson", userSettings);
        model.addAttribute("list", list);
        return "index";
    }
}
