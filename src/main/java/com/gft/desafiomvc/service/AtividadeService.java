package com.gft.desafiomvc.service;


import com.gft.desafiomvc.models.Atividade;
import com.gft.desafiomvc.repository.AtividadeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AtividadeService {

    @Autowired
    private AtividadeRepository atividadeRepository;


    public void saveAtividade(Atividade atividade) {
        atividadeRepository.save(atividade);
    }

    public void deleteAtividade(Long id) {
        atividadeRepository.deleteById(id);
    }

    public Atividade buscarPorId(Long id) throws Exception {
        Optional<Atividade> atividade = atividadeRepository.findById(id);
        if (atividade.isEmpty()) {
            throw new Exception("Atividade nao encotrada");
        }
        return atividade.get();
    }

    public List<Atividade> bucarTodos() {
        return atividadeRepository.findAll();
    }


}
