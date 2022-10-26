package com.gft.desafiomvc.service;

import com.gft.desafiomvc.models.Evento;
import com.gft.desafiomvc.models.Grupo;
import com.gft.desafiomvc.repository.GrupoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepository grupoRepository;


    public void saveGrupo(Grupo grupo) {
        grupoRepository.save(grupo);
    }

    public void deleteGrupo(Long id) {
        grupoRepository.deleteById(id);
    }

    public List<Grupo> listarGrupo() {
        return grupoRepository.findAll();
    }

    public Grupo obterEvento(Long id) throws Exception {
        Optional<Grupo> grupo = grupoRepository.findById(id);
        if (grupo.isEmpty()) {
            throw new Exception("Grupo não encontrado");
        }
        return grupo.get();
    }


}
