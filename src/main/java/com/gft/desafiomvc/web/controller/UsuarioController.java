package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Participante;
import com.gft.desafiomvc.models.Usuario;
import com.gft.desafiomvc.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(path = "novo")
    public ModelAndView novoUsuario() {
        ModelAndView mv = new ModelAndView("usuario/novo.html");
        mv.addObject("usuario", new Usuario());
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, path = "novo")
    public ModelAndView salvarUsuario(Usuario usuario) {
        ModelAndView mv = new ModelAndView("usuario/novo.html");
        mv.addObject("usuario", new Usuario());
        usuarioService.saveUsuario(usuario);
        return mv;
    }
    @RequestMapping
    public ModelAndView listarUsuario(){
        ModelAndView mv = new ModelAndView("usuario/listar.html");
        mv.addObject("lista",usuarioService.listaUsuario());
        return mv;

    }

    @RequestMapping("/excluir")
    public ModelAndView excluirEvento(@RequestParam Long id, RedirectAttributes redirectAttributes) {

        ModelAndView mv = new ModelAndView("redirect:/usuario");

        try {
            usuarioService.deleteUsuario(id);
            redirectAttributes.addFlashAttribute("mensagem", "Usuário excluído com sucesso.");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("mensagem", "Erro ao excluir Usuario!" + e.getMessage());
        }

        return mv;
    }



}
