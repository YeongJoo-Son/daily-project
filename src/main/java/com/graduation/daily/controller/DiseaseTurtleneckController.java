package com.graduation.daily.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/disease_turtleneck")
public class DiseaseTurtleneckController {
    @GetMapping("/index")
    public String index() {
        return "disease_turtleneck/index";
    }
}
