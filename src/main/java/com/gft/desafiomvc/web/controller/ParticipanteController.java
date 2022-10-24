package com.gft.desafiomvc.web.controller;

import com.gft.desafiomvc.models.Participante;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/participantes")
public class ParticipanteController {


    @GetMapping("/cadastrar")
    public String cadastrar(Participante participante){
        return "/participante/cadastro";
    }


}
