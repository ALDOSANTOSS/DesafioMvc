package com.gft.desafiomvc.dao;

import com.gft.desafiomvc.domain.Atividade;

import java.util.List;

public interface AtividadeDao {

    void save(Atividade atividade);

    void update(Atividade atividade);

    void delete(Long id);

    Atividade findById(Long id);

    List<Atividade> findAll();


}
