package com.gft.desafiomvc.service;

import com.gft.desafiomvc.domain.Evento;

import java.util.List;

public interface EventoService {

    void salvar(Evento evento);

    void editar(Evento evento);

    void excluir(Long id);

    Evento buscarPorId(Long id);

    List<Evento> bucarTodos();


}
