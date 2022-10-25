package com.gft.desafiomvc.service;

import com.gft.desafiomvc.models.Grupo;
import com.gft.desafiomvc.models.Participante;
import com.gft.desafiomvc.repository.ParticipanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipanteService {

    @Autowired
    private ParticipanteRepository participanteRepository;

    public void saveParticipante(Participante participante) {
        participanteRepository.save(participante);
    }

    public void deleteParticipante(Long id) {
        participanteRepository.findById(id);
    }

    public List<Participante> participantesTodos() {
        return participanteRepository.findAll();

    }

    public Participante ObterParticipante(Long id) throws Exception {

        Optional<Participante> participante = participanteRepository.findById(id);

        if (participante.isEmpty()) {
            throw new Exception("´Participante não encontrado.");
        }
        return participante.get();

    }


}
