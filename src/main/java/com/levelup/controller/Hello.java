package com.levelup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class Hello {


    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String showMainPage() {
        return "user";
    }


}