package com.gft.desafiomvc.service;



import com.gft.desafiomvc.domain.Usuario;

import java.util.List;

public interface UsuarioService {
    void salvar(Usuario usuario);

    void editar(Usuario usuario);

    void excluir(Long id);

    Usuario buscarPorId(Long id);

    List<Usuario> bucarTodos();
}
