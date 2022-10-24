package com.gft.desafiomvc.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {


    @GetMapping("/")
    public String nome() {
        return "/index";
    }

}
