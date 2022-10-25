package com.gft.desafiomvc.service;

import com.gft.desafiomvc.models.Usuario;
import com.gft.desafiomvc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public void saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }


    public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> listaUsuario() {
        return usuarioRepository.findAll();
    }

    public Usuario obterUsuario(Long id) throws Exception {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if (usuario.isEmpty()) {
            throw new Exception("Usuario não encotrado.");
        }

        return usuario.get();
    }

}
