package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Atividade;
import com.gft.desafiomvc.models.Evento;
import com.gft.desafiomvc.service.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    public ModelAndView savlvarAtividade(Atividade atividade) {
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

    @RequestMapping("/excluir")
    public ModelAndView excluirAtividade(@RequestParam Long id, RedirectAttributes redirectAttributes) {

        ModelAndView mv = new ModelAndView("redirect:/atividade");

        try {
            atividadeService.deleteAtividade(id);
            redirectAttributes.addFlashAttribute("mensagem", "Atividade excluído com sucesso.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("mensagem", "Erro ao excluir Atividade!" + e.getMessage());
        }

        return mv;
    }


    @RequestMapping("/editar")
    public ModelAndView editarAtividade(@RequestParam Long id) {

        ModelAndView mv = new ModelAndView("atividade/novo.html");
       Atividade atividade;

        try {
            atividade = atividadeService.buscarPorId(id);
        }catch(Exception e) {
            atividade = new Atividade();
            mv.addObject("mensagem", e.getMessage());
        }

        mv.addObject("atividade", atividade);

        return mv;
    }




}
