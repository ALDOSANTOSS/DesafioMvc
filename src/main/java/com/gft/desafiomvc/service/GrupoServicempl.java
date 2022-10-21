package com.gft.desafiomvc.service;

import com.gft.desafiomvc.dao.GrupoDao;
import com.gft.desafiomvc.domain.Grupo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GrupoServicempl implements GrupoService{

    @Autowired
    private GrupoDao dao;

    @Override
    public void salvar(Grupo grupo) {
        dao.save(grupo);

    }

    @Override
    public void editar(Grupo grupo) {
        dao.update(grupo);

    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);

    }

    @Override
    public Grupo buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Grupo> bucarTodos() {
        return dao.findAll();
    }
}
