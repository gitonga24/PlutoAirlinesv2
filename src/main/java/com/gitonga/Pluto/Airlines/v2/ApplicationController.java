package com.gitonga.Pluto.Airlines.v2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @GetMapping("/index")
    public String Test(){
        return "index";
    }

    @GetMapping("/widgets")
    public String widgets(){
        return "widgets";
    }
}
