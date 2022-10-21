package com.gft.desafiomvc.service;

import com.gft.desafiomvc.domain.Grupo;
import com.gft.desafiomvc.domain.Participante;

import java.util.List;

public interface ParticipanteService {

    void salvar(Participante participante);

    void editar(Participante participante);

    void excluir(Long id);

    Participante buscarPorId(Long id);

    List<Participante> bucarTodos();

}
