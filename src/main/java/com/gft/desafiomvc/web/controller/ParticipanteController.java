package com.gft.desafiomvc.web.controller;

import com.gft.desafiomvc.models.Participante;
import com.gft.desafiomvc.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    @RequestMapping(value = "/cadastrarParticipante", method = RequestMethod.GET)
    public String form() {
        return "/participante/formParticipante";
    }


    @RequestMapping(value = "cadastrarParticipante", method = RequestMethod.POST)
    public String form(Participante participante) {
        participanteService.saveParticipante(participante);
        return "redirect:/cadastrarParticipantes";

    }


}
