package com.gft.desafiomvc.service;

import com.gft.desafiomvc.dao.ParticipanteDao;
import com.gft.desafiomvc.domain.Participante;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ParticipanteServicempl implements ParticipanteService{

    @Autowired
    private ParticipanteDao dao;

    @Override
    public void salvar(Participante participante) {
        dao.save(participante);

    }

    @Override
    public void editar(Participante participante) {
        dao.update(participante);

    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);

    }

    @Override
    public Participante buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Participante> bucarTodos() {
        return dao.findAll();
    }


}
