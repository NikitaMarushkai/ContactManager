package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {


    @RequestMapping("/")
    public String showIndexPage() {
        return "index";
    }

    @RequestMapping("/test")
    public String showAnotherPage(@RequestParam(value = "result") String result, Model model) {
        model.addAttribute("text", "Какой-то текст");
        model.addAttribute("result", result);
        return "another";
    }

    @RequestMapping("/test/{username}")
    public String showUsername(@PathVariable("username") String username, Model model) {
        model.addAttribute("username", username);
        return "usernameshow";
    }
}


