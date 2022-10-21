package com.gft.desafiomvc.service;

import com.gft.desafiomvc.domain.Atividade;

import java.util.List;

public interface AtividadeService {
    void salvar(Atividade atividade);
    void editar(Atividade atividade);
    void excluir(Long id);

    Atividade bucarPorId(Long id);
    List<Atividade> buscarTodos();
}
