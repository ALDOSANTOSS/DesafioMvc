package com.gft.desafiomvc.web.controller;

import com.gft.desafiomvc.models.Participante;
import com.gft.desafiomvc.service.ParticipanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("participante")
public class ParticipanteController {

    @Autowired
    private ParticipanteService participanteService;

    @RequestMapping(path = "novo")
    public ModelAndView novoParticipante() {
        ModelAndView mv = new ModelAndView("participante/novo.html");
        mv.addObject("participante", new Participante());
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, path = "novo")
    public ModelAndView salvarParticipante(Participante participante) {
        ModelAndView mv = new ModelAndView("participante/novo.html");
        mv.addObject("participante", new Participante());
        participanteService.saveParticipante(participante);
        return mv;
    }


    @RequestMapping
    public ModelAndView listarParticipante(){
        ModelAndView mv = new ModelAndView("participante/listar.html");
        mv.addObject("lista",participanteService.participantesTodos());
        return mv;

    }
}
