package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Atividade;
import com.gft.desafiomvc.models.Evento;
import com.gft.desafiomvc.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("atividade")
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @RequestMapping(path = "novo")
    public ModelAndView novoAtvidade() {
        ModelAndView mv = new ModelAndView("atividade/novo.html");
        mv.addObject("atividade", new Atividade());
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, path = "novo")
    public ModelAndView savlvarParticipante(Atividade atividade) {
        ModelAndView mv = new ModelAndView("atividade/novo.html");
        mv.addObject("atividade", new Evento());
        atividadeService.saveAtividade(atividade);
        return mv;
    }
    @RequestMapping
    public ModelAndView listarAtividade(){
        ModelAndView mv = new ModelAndView("atividade/listar.html");
        mv.addObject("lista",atividadeService.bucarTodos());
        return mv;

    }




}
