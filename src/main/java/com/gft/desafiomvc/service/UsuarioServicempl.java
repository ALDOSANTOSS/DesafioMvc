package com.gft.desafiomvc.service;

import com.gft.desafiomvc.dao.UsuarioDao;
import com.gft.desafiomvc.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UsuarioServicempl implements UsuarioService {

    @Autowired
    private UsuarioDao dao;

    @Override
    public void salvar(Usuario usuario) {
        dao.save(usuario);

    }

    @Override
    public void editar(Usuario usuario) {
        dao.update(usuario);

    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);

    }

    @Override
    public Usuario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Usuario> bucarTodos() {
        return dao.findAll();
    }
}
