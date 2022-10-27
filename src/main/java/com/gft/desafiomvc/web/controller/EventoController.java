package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Evento;
import com.gft.desafiomvc.repository.EventoRepository;
import com.gft.desafiomvc.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventoController {


    @Autowired
    private EventoService eventoService;



    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.GET)
    public String form() {
        return "evento/formEvento";

    }

    @RequestMapping(value = "/cadastrarEvento", method = RequestMethod.POST)
    public String form(Evento evento) {
        eventoService.saveEvento(evento);
        return "redirect:/cadastrarEvento";
    }


    @RequestMapping(value = "/eventos",method = RequestMethod.GET)
    public ModelAndView listaEventos() {
        ModelAndView mv = new ModelAndView("listaEvento.html");
        Iterable<Evento> eventos = eventoService.listarEvento();
        mv.addObject("eventos", eventos);
        return mv;
    }


}
