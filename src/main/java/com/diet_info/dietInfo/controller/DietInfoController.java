package com.diet_info.dietInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DietInfoController {
    
    @RequestMapping("/")
    public String index() {
        return "index";
    }  
}
