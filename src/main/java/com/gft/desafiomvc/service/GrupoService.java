package com.gft.desafiomvc.service;

import com.gft.desafiomvc.domain.Evento;
import com.gft.desafiomvc.domain.Grupo;

import java.util.List;

public interface GrupoService {

    void salvar(Grupo grupo);

    void editar(Grupo grupo);

    void excluir(Long id);

    Grupo buscarPorId(Long id);

    List<Grupo> bucarTodos();


}
