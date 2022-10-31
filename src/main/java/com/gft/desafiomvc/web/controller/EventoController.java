package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Evento;
import com.gft.desafiomvc.service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("evento")
public class EventoController {

    @Autowired
    private EventoService eventoService;


    @RequestMapping(path = "novo")
    public ModelAndView novoEvento() {
        ModelAndView mv = new ModelAndView("evento/novo.html");
        mv.addObject("evento", new Evento());
        return mv;

    }

    @RequestMapping(method = RequestMethod.POST, path = "novo")
    public ModelAndView salvarEvento(Evento evento) {
        ModelAndView mv = new ModelAndView("evento/novo.html");
        mv.addObject("evento", new Evento());
        eventoService.saveEvento(evento);
        return mv;
    }


    @RequestMapping
    public ModelAndView listarEvento() {
        ModelAndView mv = new ModelAndView("evento/listar.html");
        mv.addObject("lista", eventoService.listarEvento());
        return mv;

    }

    @RequestMapping("/excluir")
    public ModelAndView excluirEvento(@RequestParam Long id, RedirectAttributes redirectAttributes) {

        ModelAndView mv = new ModelAndView("redirect:/evento");

        try {
            eventoService.deleteEvento(id);
            redirectAttributes.addFlashAttribute("mensagem", "Evento excluído com sucesso.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("mensagem", "Erro ao excluir evento!" + e.getMessage());
        }

        return mv;
    }


}
