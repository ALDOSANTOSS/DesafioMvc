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

    /* @RequestMapping(value = "/cadastrarAtividade", method = RequestMethod.POST)
    public String form(Atividade atividade) {
        atividadeService.saveAtividade(atividade);
        return "redirect:/cadastrarAtividade";
    } */

    /* @RequestMapping("/atividades")
    public ModelAndView listaAtividade() {
        ModelAndView mv = new ModelAndView("layout");
        Iterable<Atividade> atividades = atividadeService.bucarTodos();
        mv.addObject("atividades", atividades);
        return mv;
    }*/


}
