package com.gft.desafiomvc.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping()
public class UsuarioController {


    @RequestMapping(value = "/usuario",method = RequestMethod.GET)
    public String form(){
        return "usuario/formUsuario";
    }
}
