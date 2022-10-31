package com.gft.desafiomvc.service;

import com.gft.desafiomvc.models.Evento;
import com.gft.desafiomvc.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public void saveEvento(Evento evento) {
        eventoRepository.save(evento);
    }


    public void deleteEvento(Long id) {
        eventoRepository.deleteById(id);
    }

    public List<Evento> listarEvento() {
        return eventoRepository.findAll();
    }

    public Evento obterEvento(Long id) throws Exception {
        Optional<Evento> evento = eventoRepository.findById(id);

        if (evento.isEmpty()) {
            throw new Exception("Evento não encontrado");
        }
        return evento.get();
    }


}

