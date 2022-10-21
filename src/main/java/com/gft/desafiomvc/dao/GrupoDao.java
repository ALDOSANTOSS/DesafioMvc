package com.gft.desafiomvc.dao;

import com.gft.desafiomvc.domain.Grupo;

import java.util.List;

public interface GrupoDao {
    void save(Grupo grupo);

    void update(Grupo grupo);

    void delete(Long id);

    Grupo findById(Long id);

    List<Grupo> findAll();


}
