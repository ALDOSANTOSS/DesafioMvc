package com.gft.desafiomvc.web.controller;


import com.gft.desafiomvc.models.Participante;
import com.gft.desafiomvc.models.Usuario;
import com.gft.desafiomvc.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(path = "usuario")
    public ModelAndView novoUsuario() {
        ModelAndView mv = new ModelAndView("usuario/novo.html");
        mv.addObject("usuario", new Usuario());
        return mv;
    }

    @RequestMapping(method = RequestMethod.POST, path = "usuario")
    public ModelAndView salvarUsuario(Usuario usuario) {
        ModelAndView mv = new ModelAndView("usuario/novo.html");
        mv.addObject("usuario", new Usuario());
        usuarioService.saveUsuario(usuario);
        return mv;
    }



}
