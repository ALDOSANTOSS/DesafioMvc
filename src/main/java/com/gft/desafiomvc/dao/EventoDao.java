package com.gft.desafiomvc.dao;


import com.gft.desafiomvc.domain.Evento;

import java.util.List;

public interface EventoDao {
    void save(Evento evento);

    void update(Evento evento);

    void delete(Long id);

    Evento findById(Long id);

    List<Evento> findAll();
}
