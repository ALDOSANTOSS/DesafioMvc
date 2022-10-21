package com.gft.desafiomvc.dao;

import com.gft.desafiomvc.domain.Participante;

import java.util.List;

public interface ParticipanteDao {

    void save(Participante participante);

    void update(Participante participante);

    void delete(Long id);

    Participante findById(Long id);

    List<Participante> findAll();

}
