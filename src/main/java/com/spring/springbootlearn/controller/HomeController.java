package com.spring.springbootlearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}
