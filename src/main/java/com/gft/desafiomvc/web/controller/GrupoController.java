package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Grupo;
import com.gft.desafiomvc.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GrupoController {


    @Autowired
    private GrupoService grupoService;

    @RequestMapping(value = "cadastrarGrupo", method = RequestMethod.GET)
    public String form() {
        return "grupo/formGrupo";
    }

    @RequestMapping(value = "cadastrarGrupo", method = RequestMethod.POST)
    public String form(Grupo grupo) {
        grupoService.saveGrupo(grupo);
        return "redirect:/cadastrarGrupo";

    }


}
