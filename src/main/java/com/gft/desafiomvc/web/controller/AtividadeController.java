package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Atividade;
import com.gft.desafiomvc.models.Evento;
import com.gft.desafiomvc.repository.AtividadeRepository;
import com.gft.desafiomvc.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AtividadeController {

    @Autowired
    private AtividadeService atividadeService;

    @RequestMapping(value = "/cadastrarAtividade", method = RequestMethod.GET)
    public String form() {
        return "atividade/formAtividade";

    }

    @RequestMapping(value = "/cadastrarAtividade", method = RequestMethod.POST)
    public String form(Atividade atividade) {
        atividadeService.saveAtividade(atividade);
        return "redirect:/cadastrarAtividade";
    }

}
