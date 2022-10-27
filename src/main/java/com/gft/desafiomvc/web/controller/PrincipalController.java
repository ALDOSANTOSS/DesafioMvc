package com.gft.desafiomvc.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PrincipalController {

    @RequestMapping
    public ModelAndView index() {

        return new ModelAndView("index.html");


    }

    @RequestMapping("sobre")
    public ModelAndView sobre() {

        return new ModelAndView("sobre.html");

    }

}
