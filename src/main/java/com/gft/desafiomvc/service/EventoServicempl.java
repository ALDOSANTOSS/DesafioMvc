package com.gft.desafiomvc.service;

import com.gft.desafiomvc.dao.EventoDao;
import com.gft.desafiomvc.domain.Evento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoServicempl implements EventoService{

    @Autowired
    private EventoDao dao;


    @Override
    public void salvar(Evento evento) {
        dao.save(evento);

    }

    @Override
    public void editar(Evento evento) {
        dao.update(evento);

    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);

    }

    @Override
    public Evento buscarPorId(Long id) {
        return  dao.findById(id);
    }

    @Override
    public List<Evento> bucarTodos() {
        return dao.findAll();
    }
}
