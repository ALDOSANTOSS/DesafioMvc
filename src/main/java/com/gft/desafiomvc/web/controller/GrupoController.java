package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Evento;
import com.gft.desafiomvc.models.Grupo;
import com.gft.desafiomvc.service.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("grupo")
public class GrupoController {


    @Autowired
    private GrupoService grupoService;


    @RequestMapping(path = "novo")
    public ModelAndView novoGrupo() {
        ModelAndView mv = new ModelAndView("grupo/novo.html");
        mv.addObject("grupo", new Grupo());
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, path = "novo")
    public ModelAndView savlvarGrupo(Grupo grupo) {
        ModelAndView mv = new ModelAndView("grupo/novo.html");
        mv.addObject("grupo", new Grupo());
        grupoService.saveGrupo(grupo);
        return mv;
    }

    @RequestMapping
    public ModelAndView listarGrupo(){
        ModelAndView mv = new ModelAndView("grupo/listar.html");
        mv.addObject("lista",grupoService.listarGrupo());
        return mv;

    }

}
